function Person(name) {
    this.name = name
    this.walk = function() {
        return this.name + "está andando"
    }
}

const emanuel = new Person("emanuel");

console.log(emanuel);