function getRequestParam(urlStr) {
    let url = urlStr ? urlStr.substr(urlStr.indexOf('?')) : location.search;
    let param = {};
    if (url.indexOf('?') !== -1) {
        url.substr(1)
            .split('&')
            .forEach(function (item) {
                let array = item.split('=');
                param[array[0]] = unescape(array[1]);
            });
    }
    return param;
}

// 多条件相同元素合并成一个新数组
function sameMultCond(jsonArr, keyInfo, conditions) {
  const newJson = []; //合并好的数据都放在这个数组里
  jsonArr.forEach(itemJson => {
    let mark = -1;
    const finded = newJson.find((itemFind, indexFind) => {
      let ifCond = true;
      conditions.forEach(cond => {
        ifCond = ifCond && itemFind[cond] === itemJson[cond];
      });
      if (ifCond) {
        mark = indexFind;
        return ifCond;
      }
    });
    if (!finded) {
      const value = {};
      conditions.forEach(cond => {
        value[cond] = itemJson[cond];
      });
      value[keyInfo] = [];
      const info = {};
      for (const i in itemJson) {
        let ifCond = true;
        conditions.forEach(cond => {
          ifCond = ifCond && i !== cond;
        });
        if (ifCond) {
          info[i] = itemJson[i];
        }
      }
      value[keyInfo].push(info);
      newJson.push(value);
    } else {
      const info = {};
      for (const i in itemJson) {
        let ifCond = true;
        conditions.forEach(cond => {
          ifCond = ifCond && i !== cond;
        });
        if (ifCond) {
          info[i] = itemJson[i];
        }
      }
      newJson[mark][keyInfo].push(info);
    }
  });
  return newJson;
};

// 单位数前补0
function formatNumber(n) {
  return n > 9 ? n.toString() : "0" + n;
};

// x轴时间的改变
function xAxisTimeFormat(timeType, timeValue) {
  const numData = [];
  const dt = new Date(timeValue)
  const year = dt.getFullYear();
  if (timeType === "year") {
    for (let n = 1; n <= 12; n++) {
      numData.push(`${timeValue}-${formatNumber(n)}`);
    }
  }
  if (timeType === "month") {
    const month = dt.getMonth() + 1;
    dt.setMonth(month)
    dt.setDate(0);
    for (let n = 1; n <= dt.getDate(); n++) {
      numData.push(`${year}-${formatNumber(month)}-${formatNumber(n)}`);
    }
  }
  
  return numData;
};