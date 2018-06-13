package mygame;

import com.jme3.app.SimpleApplication;
import com.jme3.audio.AudioData.DataType;
import com.jme3.audio.AudioNode;
import com.jme3.input.KeyInput;
import com.jme3.input.controls.ActionListener;
import com.jme3.input.controls.KeyTrigger;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.FastMath;
import com.jme3.math.Quaternion;
import com.jme3.math.Vector3f;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;
import com.jme3.system.AppSettings;

/**
 * This is the Main Class of your Game. You should only do initialization here.
 * Move your Logic into AppStates or Controls
 *
 * @author normenhansen
 */
public class Main extends SimpleApplication {

    private AudioController audioController;
    private Material apertado;
    private Material mat, mat2;
    private Boolean highpitch = false;
    private Boolean lowpitch = false;

    public static void main(String[] args) {
        Main app = new Main();
        AppSettings a = new AppSettings(true);

        a.setWidth(1280);
        a.setHeight(720);

        app.setSettings(a);
        app.setShowSettings(false);
        app.setDisplayFps(false);
        app.setDisplayStatView(false);
        app.start();
    }

    @Override
    public void simpleInitApp() {

        apertado = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat.setColor("Color", ColorRGBA.White);

        for (int i = 0; i < 28; i++) {
            Box b = new Box(1, 1, 3);
            Geometry geom = new Geometry("Box" + i, b);

            geom.setMaterial(mat);
            geom.setLocalTranslation(i * 2.25f, 0, 0);
            rootNode.attachChild(geom);
        }
        mat.setColor("Color", ColorRGBA.Black);
        Box c = new Box(0.0001f, 0.0001f, 0.0001f);
        Geometry geomc = new Geometry("Box28", c);
        geomc.setMaterial(mat);
        geomc.setLocalTranslation(29.75f, 0, 0);
        rootNode.attachChild(geomc);
        mat.setColor("Color", ColorRGBA.White);

        mat2 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat2.setColor("Color", ColorRGBA.Orange);
        for (int i = 0; i < 27; i++) {
            if (i != 2 && i != 6 && i != 9 && i != 13 && i != 16 && i != 20 && i != 23 && i != 27) {
                Box b = new Box(1, 1, 2);
                Geometry geom = new Geometry("Box#" + i, b);

                geom.setMaterial(mat2);
                geom.setLocalTranslation(i * 2.25f + 1, 0.5f, -0.5f);
                rootNode.attachChild(geom);
            }
        }
        audioController = new AudioController(rootNode, assetManager);

        apertado.setColor("Color", ColorRGBA.Blue);
        cam.setLocation(new Vector3f(30f, 30f, 38f));
        Quaternion q = new Quaternion();
        q.fromAngleAxis(-FastMath.HALF_PI / 12, Vector3f.UNIT_X);
        cam.lookAt(rootNode.getChild("Box28").getLocalTranslation(), Vector3f.UNIT_Y);
        initKeys();
        flyCam.setEnabled(false);
    }

    @Override
    public void simpleUpdate(float tpf) {
    }

    private void initKeys() {
        inputManager.addMapping("Do1", new KeyTrigger(KeyInput.KEY_Q));
        inputManager.addMapping("Do#1", new KeyTrigger(KeyInput.KEY_2));
        inputManager.addMapping("Re1", new KeyTrigger(KeyInput.KEY_W));
        inputManager.addMapping("Re#1", new KeyTrigger(KeyInput.KEY_3));
        inputManager.addMapping("Mi1", new KeyTrigger(KeyInput.KEY_E));
        inputManager.addMapping("Fa1", new KeyTrigger(KeyInput.KEY_R));
        inputManager.addMapping("Fa#1", new KeyTrigger(KeyInput.KEY_5));
        inputManager.addMapping("Sol1", new KeyTrigger(KeyInput.KEY_T));
        inputManager.addMapping("Sol#1", new KeyTrigger(KeyInput.KEY_6));
        inputManager.addMapping("La1", new KeyTrigger(KeyInput.KEY_Y));
        inputManager.addMapping("La#1", new KeyTrigger(KeyInput.KEY_7));
        inputManager.addMapping("Si1", new KeyTrigger(KeyInput.KEY_U));

        inputManager.addMapping("HighPitch", new KeyTrigger(KeyInput.KEY_SPACE));
        inputManager.addMapping("LowPitch", new KeyTrigger(KeyInput.KEY_LSHIFT));

        inputManager.addMapping("Do2", new KeyTrigger(KeyInput.KEY_C));
        inputManager.addMapping("Do#2", new KeyTrigger(KeyInput.KEY_F));
        inputManager.addMapping("Re2", new KeyTrigger(KeyInput.KEY_V));
        inputManager.addMapping("Re#2", new KeyTrigger(KeyInput.KEY_G));
        inputManager.addMapping("Mi2", new KeyTrigger(KeyInput.KEY_B));
        inputManager.addMapping("Fa2", new KeyTrigger(KeyInput.KEY_N));
        inputManager.addMapping("Fa#2", new KeyTrigger(KeyInput.KEY_J));
        inputManager.addMapping("Sol2", new KeyTrigger(KeyInput.KEY_M));
        inputManager.addMapping("Sol#2", new KeyTrigger(KeyInput.KEY_K));
        inputManager.addMapping("La2", new KeyTrigger(KeyInput.KEY_COMMA));
        inputManager.addMapping("La#2", new KeyTrigger(KeyInput.KEY_L));
        inputManager.addMapping("Si2", new KeyTrigger(KeyInput.KEY_PERIOD));

        inputManager.addListener(actionlistener, "Do1", "Do#1", "Re1", "Re#1", "Mi1", "Fa1", "Fa#1", "Sol1", "Sol#1", "La1", "La#1", "Si1", "Do2", "Do#2", "Re2", "Re#2", "Mi2", "Fa2", "Fa#2", "Sol2", "Sol#2", "La2", "La#2", "Si2", "HighPitch", "LowPitch");
    }

    private ActionListener actionlistener = new ActionListener() {
        @Override
        public void onAction(String name, boolean isPressed, float tpf) {

            if (name.equals("HighPitch") && isPressed) {
                highpitch = true;
            } else if (name.equals("HighPitch") && !isPressed) {
                highpitch = false;
            }

            if (name.equals("LowPitch") && isPressed) {
                lowpitch = true;
            } else if (name.equals("LowPitch") && !isPressed) {
                lowpitch = false;
            }

            if (name.equals("Do1") && isPressed) {
                audioController.playSound(name, highpitch, lowpitch);
                if (!lowpitch) {
                    rootNode.getChild("Box7").setMaterial(apertado);
                } else {
                    rootNode.getChild("Box0").setMaterial(apertado);
                }
            }
            if (name.equals("Do1") && !isPressed) {
                rootNode.getChild("Box7").setMaterial(mat);
                rootNode.getChild("Box0").setMaterial(mat);
            }

            if (name.equals("Do#1") && isPressed) {
                audioController.playSound(name, highpitch, lowpitch);
                if (!lowpitch) {
                    rootNode.getChild("Box#7").setMaterial(apertado);
                } else {
                    rootNode.getChild("Box#0").setMaterial(apertado);
                }
            }
            if (name.equals("Do#1") && !isPressed) {
                rootNode.getChild("Box#7").setMaterial(mat2);
                rootNode.getChild("Box#0").setMaterial(mat2);
            }

            if (name.equals("Re1") && isPressed) {
                audioController.playSound(name, highpitch, lowpitch);
                if (!lowpitch) {
                    rootNode.getChild("Box8").setMaterial(apertado);
                } else {
                    rootNode.getChild("Box1").setMaterial(apertado);
                }
            }
            if (name.equals("Re1") && !isPressed) {
                rootNode.getChild("Box8").setMaterial(mat);
                rootNode.getChild("Box1").setMaterial(mat);
            }

            if (name.equals("Re#1") && isPressed) {
                audioController.playSound(name, highpitch, lowpitch);
                if (!lowpitch) {
                    rootNode.getChild("Box#8").setMaterial(apertado);
                } else {
                    rootNode.getChild("Box#1").setMaterial(apertado);
                }
            }
            if (name.equals("Re#1") && !isPressed) {
                rootNode.getChild("Box#8").setMaterial(mat2);
                rootNode.getChild("Box#1").setMaterial(mat2);
            }

            if (name.equals("Mi1") && isPressed) {
                audioController.playSound(name, highpitch, lowpitch);
                if (!lowpitch) {
                    rootNode.getChild("Box9").setMaterial(apertado);
                } else {
                    rootNode.getChild("Box2").setMaterial(apertado);
                }
            }
            if (name.equals("Mi1") && !isPressed) {
                rootNode.getChild("Box9").setMaterial(mat);
                rootNode.getChild("Box2").setMaterial(mat);
            }

            if (name.equals("Fa1") && isPressed) {
                audioController.playSound(name, highpitch, lowpitch);
                if (!lowpitch) {
                    rootNode.getChild("Box10").setMaterial(apertado);
                } else {
                    rootNode.getChild("Box3").setMaterial(apertado);
                }
            }
            if (name.equals("Fa1") && !isPressed) {
                rootNode.getChild("Box10").setMaterial(mat);
                rootNode.getChild("Box3").setMaterial(mat);
            }

            if (name.equals("Fa#1") && isPressed) {
                audioController.playSound(name, highpitch, lowpitch);
                if (!lowpitch) {
                    rootNode.getChild("Box#10").setMaterial(apertado);
                } else {
                    rootNode.getChild("Box#3").setMaterial(apertado);
                }
            }
            if (name.equals("Fa#1") && !isPressed) {
                rootNode.getChild("Box#10").setMaterial(mat2);
                rootNode.getChild("Box#3").setMaterial(mat2);
            }

            if (name.equals("Sol1") && isPressed) {
                audioController.playSound(name, highpitch, lowpitch);
                if (!lowpitch) {
                    rootNode.getChild("Box11").setMaterial(apertado);
                } else {
                    rootNode.getChild("Box4").setMaterial(apertado);
                }
            }
            if (name.equals("Sol1") && !isPressed) {
                rootNode.getChild("Box11").setMaterial(mat);
                rootNode.getChild("Box4").setMaterial(mat);
            }

            if (name.equals("Sol#1") && isPressed) {
                audioController.playSound(name, highpitch, lowpitch);
                if (!lowpitch) {
                    rootNode.getChild("Box#11").setMaterial(apertado);
                } else {
                    rootNode.getChild("Box#4").setMaterial(apertado);
                }
            }
            if (name.equals("Sol#1") && !isPressed) {
                rootNode.getChild("Box#11").setMaterial(mat2);
                rootNode.getChild("Box#4").setMaterial(mat2);
            }

            if (name.equals("La1") && isPressed) {
                audioController.playSound(name, highpitch, lowpitch);
                if (!lowpitch) {
                    rootNode.getChild("Box12").setMaterial(apertado);
                } else {
                    rootNode.getChild("Box5").setMaterial(apertado);
                }
            }
            if (name.equals("La1") && !isPressed) {
                rootNode.getChild("Box12").setMaterial(mat);
                rootNode.getChild("Box5").setMaterial(mat);
            }

            if (name.equals("La#1") && isPressed) {
                audioController.playSound(name, highpitch, lowpitch);
                if (!lowpitch) {
                    rootNode.getChild("Box#12").setMaterial(apertado);
                } else {
                    rootNode.getChild("Box#5").setMaterial(apertado);
                }
            }
            if (name.equals("La#1") && !isPressed) {
                rootNode.getChild("Box#12").setMaterial(mat2);
                rootNode.getChild("Box#5").setMaterial(mat2);
            }

            if (name.equals("Si1") && isPressed) {
                audioController.playSound(name, highpitch, lowpitch);
                if (!lowpitch) {
                    rootNode.getChild("Box13").setMaterial(apertado);
                } else {
                    rootNode.getChild("Box6").setMaterial(apertado);
                }
            }
            if (name.equals("Si1") && !isPressed) {
                rootNode.getChild("Box13").setMaterial(mat);
                rootNode.getChild("Box6").setMaterial(mat);
            }

            if (name.equals("Do2") && isPressed) {
                audioController.playSound(name, highpitch, lowpitch);
                if (!highpitch) {
                    rootNode.getChild("Box14").setMaterial(apertado);
                } else {
                    rootNode.getChild("Box21").setMaterial(apertado);
                }
            }
            if (name.equals("Do2") && !isPressed) {
                rootNode.getChild("Box14").setMaterial(mat);
                rootNode.getChild("Box21").setMaterial(mat);
            }
            if (name.equals("Do#2") && isPressed) {
                audioController.playSound(name, highpitch, lowpitch);
                if (!highpitch) {
                    rootNode.getChild("Box#14").setMaterial(apertado);
                } else {
                    rootNode.getChild("Box#21").setMaterial(apertado);
                }
            }
            if (name.equals("Do#2") && !isPressed) {
                rootNode.getChild("Box#14").setMaterial(mat2);
                rootNode.getChild("Box#21").setMaterial(mat2);
            }
            if (name.equals("Re2") && isPressed) {
                audioController.playSound(name, highpitch, lowpitch);
                if (!highpitch) {
                    rootNode.getChild("Box15").setMaterial(apertado);
                } else {
                    rootNode.getChild("Box22").setMaterial(apertado);
                }
            }
            if (name.equals("Re2") && !isPressed) {
                rootNode.getChild("Box15").setMaterial(mat);
                rootNode.getChild("Box22").setMaterial(mat);
            }
            if (name.equals("Re#2") && isPressed) {
                audioController.playSound(name, highpitch, lowpitch);
                if (!highpitch) {
                    rootNode.getChild("Box#15").setMaterial(apertado);
                } else {
                    rootNode.getChild("Box#22").setMaterial(apertado);
                }
            }
            if (name.equals("Re#2") && !isPressed) {
                rootNode.getChild("Box#15").setMaterial(mat2);
                rootNode.getChild("Box#22").setMaterial(mat2);
            }

            if (name.equals("Mi2") && isPressed) {
                audioController.playSound(name, highpitch, lowpitch);
                if (!highpitch) {
                    rootNode.getChild("Box16").setMaterial(apertado);
                } else {
                    rootNode.getChild("Box23").setMaterial(apertado);
                }
            }
            if (name.equals("Mi2") && !isPressed) {
                rootNode.getChild("Box16").setMaterial(mat);
                rootNode.getChild("Box23").setMaterial(mat);
            }

            if (name.equals("Fa2") && isPressed) {
                audioController.playSound(name, highpitch, lowpitch);
                if (!highpitch) {
                    rootNode.getChild("Box17").setMaterial(apertado);
                } else {
                    rootNode.getChild("Box24").setMaterial(apertado);
                }
            }
            if (name.equals("Fa2") && !isPressed) {
                rootNode.getChild("Box17").setMaterial(mat);
                rootNode.getChild("Box24").setMaterial(mat);
            }

            if (name.equals("Fa#2") && isPressed) {
                audioController.playSound(name, highpitch, lowpitch);
                if (!highpitch) {
                    rootNode.getChild("Box#17").setMaterial(apertado);
                } else {
                    rootNode.getChild("Box#24").setMaterial(apertado);
                }
            }
            if (name.equals("Fa#2") && !isPressed) {
                rootNode.getChild("Box#17").setMaterial(mat2);
                rootNode.getChild("Box#24").setMaterial(mat2);
            }

            if (name.equals("Sol2") && isPressed) {
                audioController.playSound(name, highpitch, lowpitch);
                if (!highpitch) {
                    rootNode.getChild("Box18").setMaterial(apertado);
                } else {
                    rootNode.getChild("Box25").setMaterial(apertado);
                }
            }
            if (name.equals("Sol2") && !isPressed) {
                rootNode.getChild("Box18").setMaterial(mat);
                rootNode.getChild("Box25").setMaterial(mat);
            }

            if (name.equals("Sol#2") && isPressed) {
                audioController.playSound(name, highpitch, lowpitch);
                if (!highpitch) {
                    rootNode.getChild("Box#18").setMaterial(apertado);
                } else {
                    rootNode.getChild("Box#25").setMaterial(apertado);
                }
            }
            if (name.equals("Sol#2") && !isPressed) {
                rootNode.getChild("Box#18").setMaterial(mat2);
                rootNode.getChild("Box#25").setMaterial(mat2);
            }

            if (name.equals("La2") && isPressed) {
                audioController.playSound(name, highpitch, lowpitch);
                if (!highpitch) {
                    rootNode.getChild("Box19").setMaterial(apertado);
                } else {
                    rootNode.getChild("Box26").setMaterial(apertado);
                }
            }
            if (name.equals("La2") && !isPressed) {
                rootNode.getChild("Box19").setMaterial(mat);
                rootNode.getChild("Box26").setMaterial(mat);
            }

            if (name.equals("La#2") && isPressed) {
                audioController.playSound(name, highpitch, lowpitch);
                if (!highpitch) {
                    rootNode.getChild("Box#19").setMaterial(apertado);
                } else {
                    rootNode.getChild("Box#26").setMaterial(apertado);
                }
            }
            if (name.equals("La#2") && !isPressed) {
                rootNode.getChild("Box#19").setMaterial(mat2);
                rootNode.getChild("Box#26").setMaterial(mat2);
            }

            if (name.equals("Si2") && isPressed) {
                audioController.playSound(name, highpitch, lowpitch);
                if (!highpitch) {
                    rootNode.getChild("Box20").setMaterial(apertado);
                } else {
                    rootNode.getChild("Box27").setMaterial(apertado);
                }
            }
            if (name.equals("Si2") && !isPressed) {
                rootNode.getChild("Box20").setMaterial(mat);
                rootNode.getChild("Box27").setMaterial(mat);
            }
        }

    };

    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code
    }
}
