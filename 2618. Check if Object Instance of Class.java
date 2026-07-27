var checkIfInstanceOf = function(obj, classFunction) {
    if (obj === null || obj === undefined || typeof classFunction !== 'function') {
        return false;
    }
    
    let curr = Object.getPrototypeOf(Object(obj)); // Object(obj) handles primitive wrappers (e.g. 5, "str")
    while (curr !== null) {
        if (curr === classFunction.prototype) return true;
        curr = Object.getPrototypeOf(curr);
    }
    return false;
};
