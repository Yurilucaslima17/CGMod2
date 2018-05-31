package mygame;

import com.jme3.app.SimpleApplication;
import com.jme3.audio.AudioData.DataType;
import com.jme3.audio.AudioNode;
import com.jme3.input.KeyInput;
import com.jme3.input.controls.ActionListener;
import com.jme3.input.controls.KeyTrigger;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Quaternion;
import com.jme3.math.Vector3f;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;

/**
 * This is the Main Class of your Game. You should only do initialization here.
 * Move your Logic into AppStates or Controls
 * @author normenhansen
 */
public class Main extends SimpleApplication {
    
    private AudioController audioController;
    private Material apertado;
    private Material mat;
    
    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    @Override
    public void simpleInitApp() {
        
        apertado = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat.setColor("Color", ColorRGBA.White);
        
        for(int i=0;i<24;i++){
            Box b = new Box(1, 1, 3);
            Geometry geom = new Geometry("Box"+i, b);  
            
            geom.setMaterial(mat);
            geom.setLocalTranslation(i*2.25f, speed, speed);
            rootNode.attachChild(geom);
        }
        audioController = new AudioController(rootNode, assetManager);

        apertado.setColor("Color", ColorRGBA.Blue);
        cam.setLocation(new Vector3f(26f, 8f, 42f));
        //Quaternion q = new Quaternion(2.2217576E-4f, 0.8905794f, -0.45482755f, 4.3457586E-4f);
        //cam.setRotation(q);
        initKeys();
        flyCam.setEnabled(false);
    }

    @Override
    public void simpleUpdate(float tpf) {
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
        
        inputManager.addListener(actionlistener, "Do1", "Do#1", "Re1","Re#1", "Mi1", "Fa1","Fa#1", "Sol1", "Sol#1", "La1", "La#1", "Si1", "Do2", "Do#2", "Re2","Re#2", "Mi2", "Fa2","Fa#2", "Sol2", "Sol#2", "La2", "La#2", "Si2");
    }
    
    private ActionListener actionlistener = new ActionListener() {
        @Override
        public void onAction(String name, boolean isPressed, float tpf) {
            if(name.equals("Do1") && isPressed){
                audioController.playSound(name);
                rootNode.getChild("Box0").setMaterial(apertado);
            }
            if(name.equals("Do1") && !isPressed){
                rootNode.getChild("Box0").setMaterial(mat);
            }
            
            if(name.equals("Do#1") && isPressed){
                audioController.playSound(name);
                rootNode.getChild("Box1").setMaterial(apertado);
            }
            if(name.equals("Do#1") && !isPressed){
                rootNode.getChild("Box1").setMaterial(mat);
            }
            
            if(name.equals("Re1") && isPressed){
                audioController.playSound(name);
                rootNode.getChild("Box2").setMaterial(apertado);
            }
            if(name.equals("Re1") && !isPressed){
                rootNode.getChild("Box2").setMaterial(mat);
            }
            
            if(name.equals("Re#1") && isPressed){
                audioController.playSound(name);
                rootNode.getChild("Box3").setMaterial(apertado);
            }
            if(name.equals("Re#1") && !isPressed){
                rootNode.getChild("Box3").setMaterial(mat);
            }
            
            if(name.equals("Mi1") && isPressed){
                audioController.playSound(name);
                rootNode.getChild("Box4").setMaterial(apertado);
            }
            if(name.equals("Mi1") && !isPressed){
                rootNode.getChild("Box4").setMaterial(mat);
            }
            
            if(name.equals("Fa1") && isPressed){
                audioController.playSound(name);
                rootNode.getChild("Box5").setMaterial(apertado);
            }
            if(name.equals("Fa1") && !isPressed){
                rootNode.getChild("Box5").setMaterial(mat);
            }
            
            if(name.equals("Fa#1") && isPressed){
                audioController.playSound(name);
                rootNode.getChild("Box6").setMaterial(apertado);
            }
            if(name.equals("Fa#1") && !isPressed){
                rootNode.getChild("Box6").setMaterial(mat);
            }
            
            if(name.equals("Sol1") && isPressed){
                audioController.playSound(name);
                rootNode.getChild("Box7").setMaterial(apertado);
            }
            if(name.equals("Sol1") && !isPressed){
                rootNode.getChild("Box7").setMaterial(mat);
            }
            
            if(name.equals("Sol#1") && isPressed){
                audioController.playSound(name);
                rootNode.getChild("Box8").setMaterial(apertado);
            }
            if(name.equals("Sol#1") && !isPressed){
                rootNode.getChild("Box8").setMaterial(mat);
            }
            
            if(name.equals("La1") && isPressed){
                audioController.playSound(name);
                rootNode.getChild("Box9").setMaterial(apertado);
            }
            if(name.equals("La1") && !isPressed){
                rootNode.getChild("Box9").setMaterial(mat);
            }
            
            if(name.equals("La#1") && isPressed){
                audioController.playSound(name);
                rootNode.getChild("Box10").setMaterial(apertado);
            }
            if(name.equals("La#1") && !isPressed){
                rootNode.getChild("Box10").setMaterial(mat);
            }
            
            if(name.equals("Si1") && isPressed){
                audioController.playSound(name);
                rootNode.getChild("Box11").setMaterial(apertado);
            }
            if(name.equals("Si1") && !isPressed){
                rootNode.getChild("Box11").setMaterial(mat);
            }
            
            if(name.equals("Do2") && isPressed){
                audioController.playSound(name);
            }
            if(name.equals("Do#2") && isPressed){
                audioController.playSound(name);
            }
            if(name.equals("Re2") && isPressed){
                audioController.playSound(name);
            }
            if(name.equals("Re#2") && isPressed){
                audioController.playSound(name);
            }
            if(name.equals("Mi2") && isPressed){
                audioController.playSound(name);
            }
            if(name.equals("Fa2") && isPressed){
                audioController.playSound(name);
            }
            if(name.equals("Fa#2") && isPressed){
                audioController.playSound(name);
            }
            if(name.equals("Sol2") && isPressed){
                audioController.playSound(name);
            }
            if(name.equals("Sol#2") && isPressed){
                audioController.playSound(name);
            }
            if(name.equals("La2") && isPressed){
                audioController.playSound(name);
            }
            if(name.equals("La#2") && isPressed){
                audioController.playSound(name);
            }
            if(name.equals("Si2") && isPressed){
                audioController.playSound(name);
            }
        }
        
            
};       

    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code
    }
}