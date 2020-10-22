import greenfoot.*; 
/**
 * Write a description of class PacmanGoogleMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PacmanGoogleMapLoader implements StaticMapLoader 
{
    public Map loadMap()
    {
        Map map = new Map();

        addWalls(map);

        addSmallItems(map);

        addPowerItems(map);
        
        map.addObject(new Hud(), 50, 50); 
        
        map.addObject(new PacMan(), 50, 200);
        
        map.addObject(new BluePhantom(), 425, 500);
        map.addObject(new OrangePhantom(),350, 500);
        map.addObject(new PinkPhantom(), 425, 550);
        map.addObject(new RedPhantom(), 350, 550);

        return map;
    }

    void addWalls(Map map)
    {
        //Pared de arriba
        for(int x=50; x<=750 ; x+=50)
        {
            map.addObject(new Wall(), x, 50);
        }
        //Pared de abajo
        for(int x=50; x<=750 ; x+=50)
        {
            map.addObject(new Wall(), x, 800);
        }
        //Pared izquierda 
        for(int y=50; y<=800; y+=50)
        {
            map.addObject(new Wall(), 5, y);
        }
        //Pared derecha 
        for(int y=50; y<=800; y+=50)
        {
            map.addObject(new Wall(), 800, y);
        }
        //T arriba
        for(int y=80; y<=100; y+=10)
        {
            map.addObject(new Wall(), 375, y);
        }
        //T abajo
        for(int y=650; y<=670; y+=10)
        {
            map.addObject(new Wall(), 375, y);
        }
        //Techo de la casa
        for(int x=200; x<=550; x+=25)
        {
            map.addObject(new Wall(), x, 300);
        }
        //Pared izquierda de casa
        for(int y=300; y<=500; y+=10)
        {
            map.addObject(new Wall(), 200, y);
        }
        //Pared derecha de casa
        for(int y=300; y<=500; y+=10)
        {
            map.addObject(new Wall(), 550, y);
        }
        //Piso izquierdo
        for(int x=200; x<=250; x+=10)
        {
            map.addObject(new Wall(), x, 500);
        }
        //Piso derecho
        for(int x=500; x<=550; x+=10)
        {
            map.addObject(new Wall(), x, 500);
        }
    }

    void addSmallItems(Map map)
    {
        //Puntos de arriba
        for(int x = 130; x < 650; x+=20) {
            map.addObject(new SmallPoint(), x, 200);
        }
        //Puntos de la izquierda
        for(int y = 130; y < 630; y+=20){
            map.addObject(new SmallPoint(),100 , y);
        }
        //Puntos de abajo
        for(int x = 130; x < 650; x+=20) {
            map.addObject(new SmallPoint(), x, 580);
        }
        //Puntos de la derecha
        for(int y = 130; y < 630; y+=20){
            map.addObject(new SmallPoint(),650 , y);
        }
    }

    void addPowerItems(Map map)
    {
        //Puntos arriba
        map.addObject(new PowerPoint(), 100, 100);
        map.addObject(new PowerPoint(), 650, 100);
        //Puntos en medio
        map.addObject(new PowerPoint(), 100, 345);
        map.addObject(new PowerPoint(), 650, 345);
        //Puntos abajo
        map.addObject(new PowerPoint(), 100, 650);
        map.addObject(new PowerPoint(), 650, 650);

    }

}
