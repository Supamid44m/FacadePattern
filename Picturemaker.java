public class Picturemaker{
    private Picture sketch;
    private Picture drawing;
    private Picture painting;

    public Picturemaker(){
        sketch=new Sketch();
        drawing = new Drawing();
        painting = new Painting();
    }

    public void picturemake(){
        sketch.sketch();
        drawing.drawing();
        painting.painting();
        
    }
}