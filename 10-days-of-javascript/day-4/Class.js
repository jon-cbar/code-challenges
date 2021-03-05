class Polygon {
    constructor(sides) {
        this.sides = sides;
    }
    perimeter() {
        let perimeter = 0;
        this.sides.forEach(side => {
            perimeter = perimeter + side;
        });
        return perimeter;
    }
}