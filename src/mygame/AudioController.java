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
    private AudioNode cs1;
    private AudioNode d1;
    private AudioNode ds1;
    private AudioNode e1;
    private AudioNode f1;
    private AudioNode fs1;
    private AudioNode g1;
    private AudioNode gs1;
    private AudioNode a1;
    private AudioNode as1;
    private AudioNode b1;
    
    private AudioNode c2;
    private AudioNode cs2;
    private AudioNode d2;
    private AudioNode ds2;
    private AudioNode e2;
    private AudioNode f2;
    private AudioNode fs2;
    private AudioNode g2;
    private AudioNode gs2;
    private AudioNode a2;
    private AudioNode as2;
    private AudioNode b2;
    
    public AudioController(Node rootNode, AssetManager assetManager){
        c1 = new AudioNode(assetManager, "Sounds/do1.wav", DataType.Buffer);
        c1.setPositional(false);
        c1.setLooping(false);
        c1.setVolume(2);
        rootNode.attachChild(c1);
        
        cs1 = new AudioNode(assetManager, "Sounds/do#1.wav", DataType.Buffer);
        cs1.setPositional(false);
        cs1.setLooping(false);
        cs1.setVolume(2);
        rootNode.attachChild(cs1);
        
        d1 = new AudioNode(assetManager, "Sounds/re1.wav", DataType.Buffer);
        d1.setPositional(false);
        d1.setLooping(false);
        d1.setVolume(2);
        rootNode.attachChild(d1);
        
        ds1 = new AudioNode(assetManager, "Sounds/re#1.wav", DataType.Buffer);
        ds1.setPositional(false);
        ds1.setLooping(false);
        ds1.setVolume(2);
        rootNode.attachChild(ds1);
        
        e1 = new AudioNode(assetManager, "Sounds/mi1.wav", DataType.Buffer);
        e1.setPositional(false);
        e1.setLooping(false);
        e1.setVolume(2);
        rootNode.attachChild(e1);
        
        f1 = new AudioNode(assetManager, "Sounds/fa1.wav", DataType.Buffer);
        f1.setPositional(false);
        f1.setLooping(false);
        f1.setVolume(2);
        rootNode.attachChild(f1);
        
        fs1 = new AudioNode(assetManager, "Sounds/fa#1.wav", DataType.Buffer);
        fs1.setPositional(false);
        fs1.setLooping(false);
        fs1.setVolume(2);
        rootNode.attachChild(fs1);
        
        g1 = new AudioNode(assetManager, "Sounds/sol1.wav", DataType.Buffer);
        g1.setPositional(false);
        g1.setLooping(false);
        g1.setVolume(2);
        rootNode.attachChild(g1);
        
        gs1 = new AudioNode(assetManager, "Sounds/sol#1.wav", DataType.Buffer);
        gs1.setPositional(false);
        gs1.setLooping(false);
        gs1.setVolume(2);
        rootNode.attachChild(gs1);
        
        a1 = new AudioNode(assetManager, "Sounds/la1.wav", DataType.Buffer);
        a1.setPositional(false);
        a1.setLooping(false);
        a1.setVolume(2);
        rootNode.attachChild(a1);
        
        as1 = new AudioNode(assetManager, "Sounds/la#1.wav", DataType.Buffer);
        as1.setPositional(false);
        as1.setLooping(false);
        as1.setVolume(2);
        rootNode.attachChild(as1);
        
        b1 = new AudioNode(assetManager, "Sounds/si1.wav", DataType.Buffer);
        b1.setPositional(false);
        b1.setLooping(false);
        b1.setVolume(2);
        rootNode.attachChild(b1);
        
        c2 = new AudioNode(assetManager, "Sounds/do2.wav", DataType.Buffer);
        c2.setPositional(false);
        c2.setLooping(false);
        c2.setVolume(2);
        rootNode.attachChild(c2);
        
        cs2 = new AudioNode(assetManager, "Sounds/do#2.wav", DataType.Buffer);
        cs2.setPositional(false);
        cs2.setLooping(false);
        cs2.setVolume(2);
        rootNode.attachChild(cs2);
        
        d2 = new AudioNode(assetManager, "Sounds/re2.wav", DataType.Buffer);
        d2.setPositional(false);
        d2.setLooping(false);
        d2.setVolume(2);
        rootNode.attachChild(d2);
        
        ds2 = new AudioNode(assetManager, "Sounds/re#2.wav", DataType.Buffer);
        ds2.setPositional(false);
        ds2.setLooping(false);
        ds2.setVolume(2);
        rootNode.attachChild(ds2);
        
        e2 = new AudioNode(assetManager, "Sounds/mi2.wav", DataType.Buffer);
        e2.setPositional(false);
        e2.setLooping(false);
        e2.setVolume(2);
        rootNode.attachChild(e2);
        
        f2 = new AudioNode(assetManager, "Sounds/fa2.wav", DataType.Buffer);
        f2.setPositional(false);
        f2.setLooping(false);
        f2.setVolume(2);
        rootNode.attachChild(f2);
        
        fs2 = new AudioNode(assetManager, "Sounds/fa#2.wav", DataType.Buffer);
        fs2.setPositional(false);
        fs2.setLooping(false);
        fs2.setVolume(2);
        rootNode.attachChild(fs2);
        
        g2 = new AudioNode(assetManager, "Sounds/sol2.wav", DataType.Buffer);
        g2.setPositional(false);
        g2.setLooping(false);
        g2.setVolume(2);
        rootNode.attachChild(g2);
        
        gs2 = new AudioNode(assetManager, "Sounds/sol#2.wav", DataType.Buffer);
        gs2.setPositional(false);
        gs2.setLooping(false);
        gs2.setVolume(2);
        rootNode.attachChild(gs2);
        
        a2 = new AudioNode(assetManager, "Sounds/la2.wav", DataType.Buffer);
        a2.setPositional(false);
        a2.setLooping(false);
        a2.setVolume(2);
        rootNode.attachChild(a2);
        
        as2 = new AudioNode(assetManager, "Sounds/la#2.wav", DataType.Buffer);
        as2.setPositional(false);
        as2.setLooping(false);
        as2.setVolume(2);
        rootNode.attachChild(as2);
        
        b2 = new AudioNode(assetManager, "Sounds/si2.wav", DataType.Buffer);
        b2.setPositional(false);
        b2.setLooping(false);
        b2.setVolume(2);
        rootNode.attachChild(b2);
    }
    
    public void playSound(String note, Boolean highpitch, Boolean lowPitch){
        switch (note) {
            case "Do1":
                if(lowPitch){
                    c1.setPitch(0.5f);
                    c1.playInstance();
                }
                else{
                    c1.setPitch(1);
                    c1.playInstance();
                }
                break;
            case "Do#1":
                if(lowPitch){
                    cs1.setPitch(0.5f);
                    cs1.playInstance();
                }
                else{
                    cs1.setPitch(1);
                    cs1.playInstance();
                }
                break;
            case "Re1":
                if(lowPitch){
                    d1.setPitch(0.5f);
                    d1.playInstance();
                }
                else{
                    d1.setPitch(1);
                    d1.playInstance();
                }
                break;
            case "Re#1":
                if(lowPitch){
                    ds1.setPitch(0.5f);
                    ds1.playInstance();
                }
                else{
                    ds1.setPitch(1);
                    ds1.playInstance();
                }
                break;
            case "Mi1":
                if(lowPitch){
                    e1.setPitch(0.5f);
                    e1.playInstance();
                }
                else{
                    e1.setPitch(1);
                    e1.playInstance();
                }
                break;
            case "Fa1":
                if(lowPitch){
                    f1.setPitch(0.5f);
                    f1.playInstance();
                }
                else{
                    f1.setPitch(1);
                    f1.playInstance();
                }
                break;
            case "Fa#1":
                if(lowPitch){
                    fs1.setPitch(0.5f);
                    fs1.playInstance();
                }
                else{
                    fs1.setPitch(1);
                    fs1.playInstance();
                }
                break;
            case "Sol1":
                if(lowPitch){
                    g1.setPitch(0.5f);
                    g1.playInstance();
                }
                else{
                    g1.setPitch(1);
                    g1.playInstance();
                }
                break;
            case "Sol#1":
                if(lowPitch){
                    gs1.setPitch(0.5f);
                    gs1.playInstance();
                }
                else{
                    gs1.setPitch(1);
                    gs1.playInstance();
                }
                break;
            case "La1":
                if(lowPitch){
                    a1.setPitch(0.5f);
                    a1.playInstance();
                }
                else{
                    a1.setPitch(1);
                    a1.playInstance();
                }
                break;
            case "La#1":
                if(lowPitch){
                    as1.setPitch(0.5f);
                    as1.playInstance();
                }
                else{
                    as1.setPitch(1);
                    as1.playInstance();
                }
                break;
            case "Si1":
                if(lowPitch){
                    b1.setPitch(0.5f);
                    b1.playInstance();
                }
                else{
                    b1.setPitch(1);
                    b1.playInstance();
                }
                break;
            case "Do2":
                if(highpitch){
                    c2.setPitch(2);
                    c2.playInstance();
                }
                else{
                    c2.setPitch(1);
                    c2.playInstance();
                }
                break;
            case "Do#2":
                if(highpitch){
                    cs2.setPitch(2);
                    cs2.playInstance();
                }
                else{
                    cs2.setPitch(1);
                    cs2.playInstance();
                }
                    
                break;
            case "Re2":
                if(highpitch){
                    d2.setPitch(2);
                    d2.playInstance();
                }
                else{
                    d2.setPitch(1);
                    d2.playInstance();
                }
                break;
            case "Re#2":
                if(highpitch){
                    ds2.setPitch(2);
                    ds2.playInstance();
                }
                else{
                    ds2.setPitch(1);
                    ds2.playInstance();
                }
                break;
            case "Mi2":
                if(highpitch){
                    e2.setPitch(2);
                    e2.playInstance();
                }
                else{
                    e2.setPitch(1);
                    e2.playInstance();
                }
                break;
            case "Fa2":
                if(highpitch){
                    f2.setPitch(2);
                    f2.playInstance();
                }
                else{
                    f2.setPitch(1);
                    f2.playInstance();
                }
                break;
            case "Fa#2":
                if(highpitch){
                    fs2.setPitch(2);
                    fs2.playInstance();
                }
                else{
                    fs2.setPitch(1);
                    fs2.playInstance();
                }
                break;
            case "Sol2":
                if(highpitch){
                    g2.setPitch(2);
                    g2.playInstance();
                }
                else{
                    g2.setPitch(1);
                    g2.playInstance();
                }
                break;
            case "Sol#2":
                if(highpitch){
                    gs2.setPitch(2);
                    gs2.playInstance();
                }
                else{
                    gs2.setPitch(1);
                    gs2.playInstance();
                }
                break;
            case "La2":
                if(highpitch){
                    a2.setPitch(2);
                    a2.playInstance();
                }
                else{
                    a2.setPitch(1);
                    a2.playInstance();
                }
                break;
            case "La#2":
                if(highpitch){
                    as2.setPitch(2);
                    as2.playInstance();
                }
                else{
                    as2.setPitch(1);
                    as2.playInstance();
                }
                break;
            case "Si2":
                if(highpitch){
                    b2.setPitch(2);
                    b2.playInstance();
                }
                else{
                    b2.setPitch(1);
                    b2.playInstance();
                }
                break;
            default:
                break;
        }
    }
    
}
