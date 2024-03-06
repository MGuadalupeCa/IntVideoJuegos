package mygame;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.Node;
import com.jme3.scene.Spatial;
import com.jme3.scene.shape.Box;
import com.jme3.system.AppSettings;


/**
 * This is the Main Class of your Game. You should only do initialization here.
 * Move your Logic into AppStates or Controls
 * @author normenhansen
 */
public class Main extends SimpleApplication {
    public Spatial spatial_var= null;
    public Spatial spatial_var2= null;
    public Spatial spatial_var3= null;
    public Spatial spatial_var4= null;
    public Spatial spatial_var5= null;

    


    public static void main(String[] args) {
        AppSettings settings = new AppSettings(true);
        settings.setTitle("TD");
   
        Main app = new Main();
        app.setSettings(settings);
        app.start();
    }
    @Override
public void simpleInitApp() {

    Box b = new Box(0.5f, 0.5f, 0.5f);
    Geometry geom = new Geometry("Box", b);
    Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
    mat.setColor("Color", ColorRGBA.Magenta);
    geom.setMaterial(mat);

    Box b2 = new Box(0.5f, 0.5f, 0.5f);
    Geometry geom2 = new Geometry("Box2", b2);
    Material mat2 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
    mat2.setColor("Color", ColorRGBA.Blue);
    geom2.setMaterial(mat2);

    Box b3 = new Box(0.5f, 0.5f, 0.5f);
    Geometry geom3 = new Geometry("Box3", b3);
    Material mat3 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
    mat3.setColor("Color", ColorRGBA.Cyan);
    geom3.setMaterial(mat3);

    Box b4 = new Box(0.5f, 0.5f, 0.5f);
    Geometry geom4 = new Geometry("Box4", b4);
    Material mat4 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
    mat4.setColor("Color", ColorRGBA.Yellow);
    geom4.setMaterial(mat4);
    
    Box b5 = new Box(0.5f, 0.5f, 0.5f);
    Geometry geom5 = new Geometry("Box5", b5);
    Material mat5 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
    mat5.setColor("Color", ColorRGBA.Red);
    geom5.setMaterial(mat5);
    
    Box b6 = new Box(0.5f, 0.5f, 0.5f);
    Geometry geom6 = new Geometry("Box6", b6);
    Material mat6 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
    mat6.setColor("Color", ColorRGBA.Brown);
    geom6.setMaterial(mat6);

    rootNode.attachChild(geom);

    Node padre_cubos = new Node("padre_cubos");
    Node padre_cubos2 = new Node("padre_cubos2");
    Node padre_cubos3 = new Node("padre_cubos3");
    Node padre_cubos4 = new Node("padre_cubos4");


    geom2.setLocalTranslation(new Vector3f(0, 2, 5)); 
    geom3.setLocalTranslation(new Vector3f(3, 3, 3)); 
    geom5.setLocalTranslation(new Vector3f(3, 3, 3)); 
    geom6.setLocalTranslation(new Vector3f((float) 1.5, 3, 3)); 
    padre_cubos.attachChild(geom2);
    padre_cubos.attachChild(geom3);
    
    padre_cubos2.attachChild(geom4);
    padre_cubos3.attachChild(geom5);
    padre_cubos4.attachChild(geom6);
    

    geom4.setLocalTranslation(new Vector3f(3, 3, 6)); 
    rootNode.attachChild(padre_cubos);
    rootNode.attachChild(padre_cubos2);
    rootNode.attachChild(padre_cubos3);
    rootNode.attachChild(padre_cubos4);

    spatial_var = rootNode.getChild("padre_cubos2");


}

@Override
public void simpleUpdate(float tpf) {
    // Rotar Box2 y Box3 alrededor de Box
    spatial_var = rootNode.getChild("padre_cubos2");
    spatial_var = rootNode.getChild("padre_cubos3");
    spatial_var = rootNode.getChild("padre_cubos4");
    spatial_var = rootNode.getChild("Box2");
    spatial_var2 = rootNode.getChild("Box3");
    spatial_var3 = rootNode.getChild("Box4");
    spatial_var4 = rootNode.getChild("Box5");
    spatial_var5 = rootNode.getChild("Box6");

    spatial_var.rotate((float) 0, (float) 0.09, 0);
    spatial_var2.rotate((float) 0, (float) 0.02, 0);
    spatial_var3.rotate((float) 0, (float) 0.03, 0);
    spatial_var4.rotate((float) 0, (float) 0.04, 0);
    spatial_var5.rotate((float) 0, (float) 0.05, 0);





    rootNode.getChild("padre_cubos").rotate(0, (float) 0.01, 0);
    rootNode.getChild("padre_cubos2").rotate(0, tpf, 0);
    rootNode.getChild("padre_cubos3").rotate(0, tpf, 0);
    rootNode.getChild("padre_cubos4").rotate(0, (float) 0.05, 0);

    
}

}
