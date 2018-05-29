/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame;

import com.jme3.asset.AssetManager;
import com.jme3.audio.AudioNode;
import com.jme3.scene.Node;
import com.jme3.audio.AudioData.DataType;

/**
 *
 * @author Bruno
 */
public class AudioController {
    private AudioNode c1;
    private AudioNode d1;
    private AudioNode e1;
    private AudioNode f1;
    private AudioNode g1;
    private AudioNode a1;
    private AudioNode b1;
    
    public AudioController(Node rootNode, AssetManager assetManager){
        c1 = new AudioNode(assetManager, "Sounds/do.wav", DataType.Buffer);
        c1.setPositional(false);
        c1.setLooping(false);
        c1.setVolume(2);
        rootNode.attachChild(c1);
        
        d1 = new AudioNode(assetManager, "Sounds/re.wav", DataType.Buffer);
        d1.setPositional(false);
        d1.setLooping(false);
        d1.setVolume(2);
        rootNode.attachChild(d1);
        
        e1 = new AudioNode(assetManager, "Sounds/mi.wav", DataType.Buffer);
        e1.setPositional(false);
        e1.setLooping(false);
        e1.setVolume(2);
        rootNode.attachChild(e1);
        
        f1 = new AudioNode(assetManager, "Sounds/fa.wav", DataType.Buffer);
        f1.setPositional(false);
        f1.setLooping(false);
        f1.setVolume(2);
        rootNode.attachChild(f1);
        
        g1 = new AudioNode(assetManager, "Sounds/sol.wav", DataType.Buffer);
        g1.setPositional(false);
        g1.setLooping(false);
        g1.setVolume(2);
        rootNode.attachChild(g1);
        
        a1 = new AudioNode(assetManager, "Sounds/la.wav", DataType.Buffer);
        a1.setPositional(false);
        a1.setLooping(false);
        a1.setVolume(2);
        rootNode.attachChild(a1);
        
        b1 = new AudioNode(assetManager, "Sounds/si.wav", DataType.Buffer);
        b1.setPositional(false);
        b1.setLooping(false);
        b1.setVolume(2);
        rootNode.attachChild(b1);
    }
    
    public void playSound(String note){
        switch (note) {
            case "Do1":
                c1.setPitch(.5f);
                c1.playInstance();
                break;
            case "Do#1":
                break;
            case "Re1":
                d1.setPitch(.5f);
                d1.playInstance();
                break;
            case "Mi1":
                e1.setPitch(.5f);
                e1.playInstance();
                break;
            case "Fa1":
                f1.setPitch(.5f);
                f1.playInstance();
                break;
            case "Fa#1":
                break;
            case "Sol1":
                g1.setPitch(.5f);
                g1.playInstance();
                break;
            case "Sol#1":
                break;
            case "La1":
                a1.setPitch(.5f);
                a1.playInstance();
                break;
            case "La#1":
                break;
            case "Si1":
                b1.setPitch(.5f);
                b1.playInstance();
                break;
            case "Si#1":
                break;
            default:
                break;
        }
    }
    
}
