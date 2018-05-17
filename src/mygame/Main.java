package mygame;

import com.jme3.app.SimpleApplication;
import com.jme3.input.KeyInput;
import com.jme3.input.controls.ActionListener;
import com.jme3.input.controls.KeyTrigger;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;

/**
 * This is the Main Class of your Game. You should only do initialization here.
 * Move your Logic into AppStates or Controls
 * @author normenhansen
 */
public class Main extends SimpleApplication {

    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    @Override
    public void simpleInitApp() {
        Box b = new Box(1, 1, 1);
        Geometry geom = new Geometry("Box", b);

        Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat.setColor("Color", ColorRGBA.Blue);
        geom.setMaterial(mat);

        rootNode.attachChild(geom);
        
        initKeys();
    }

    @Override
    public void simpleUpdate(float tpf) {
        //TODO: add update code
    }
    
    private void initKeys(){
        inputManager.addMapping("Do1",new KeyTrigger(KeyInput.KEY_Q));
        inputManager.addMapping("Do#1",new KeyTrigger(KeyInput.KEY_2));
        inputManager.addMapping("Re1",new KeyTrigger(KeyInput.KEY_W));
        inputManager.addMapping("Re#1",new KeyTrigger(KeyInput.KEY_3));
        inputManager.addMapping("Mi1",new KeyTrigger(KeyInput.KEY_E));
        inputManager.addMapping("Fa1",new KeyTrigger(KeyInput.KEY_R));
        inputManager.addMapping("Fa#1",new KeyTrigger(KeyInput.KEY_5));
        inputManager.addMapping("Sol1",new KeyTrigger(KeyInput.KEY_T));
        inputManager.addMapping("Sol#1",new KeyTrigger(KeyInput.KEY_6));
        inputManager.addMapping("La1",new KeyTrigger(KeyInput.KEY_Y));
        inputManager.addMapping("La#1",new KeyTrigger(KeyInput.KEY_7));
        inputManager.addMapping("Si1",new KeyTrigger(KeyInput.KEY_U));
        
        inputManager.addMapping("Do2",new KeyTrigger(KeyInput.KEY_C));
        inputManager.addMapping("Do#2",new KeyTrigger(KeyInput.KEY_F));
        inputManager.addMapping("Re2",new KeyTrigger(KeyInput.KEY_V));
        inputManager.addMapping("Re#2",new KeyTrigger(KeyInput.KEY_G));
        inputManager.addMapping("Mi2",new KeyTrigger(KeyInput.KEY_B));
        inputManager.addMapping("Fa2",new KeyTrigger(KeyInput.KEY_N));
        inputManager.addMapping("Fa#2",new KeyTrigger(KeyInput.KEY_J));
        inputManager.addMapping("Sol2",new KeyTrigger(KeyInput.KEY_M));
        inputManager.addMapping("Sol#2",new KeyTrigger(KeyInput.KEY_K));
        inputManager.addMapping("La2",new KeyTrigger(KeyInput.KEY_COMMA));
        inputManager.addMapping("La#2",new KeyTrigger(KeyInput.KEY_L));
        inputManager.addMapping("Si2",new KeyTrigger(KeyInput.KEY_PERIOD));
    }
    
    private ActionListener actionlistener = new ActionListener() {
        @Override
        public void onAction(String name, boolean isPressed, float tpf) {
            
        }
            
};
         

    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code
    }
}
