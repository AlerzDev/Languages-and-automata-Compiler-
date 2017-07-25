###Code structure
program = CodeDraw{ createCanvas nextLineCode }

nextLineCode= lineCode

nextLineCode = lineCode nextLineCode

###Create canvas
createCanvas = Canvas(n, n);

###Adding or update attributes to the canvas
lineCode = CanvasAddFigure(figure);

lineCode = CanvasBackground(color);

###Create line
figure = Line(color, n, n, n, n);

###Create Square
figure = Square(color, color, n, n, n);

###Create Circle
figure = Circle(color, color, n, n, n);

n = int

color =

 Red

 |Green

 |Yellow

 |Blue

 |Purple

 |Brown

 |Grey

 |Pink    

 |White

 |Black
