import React, { useState } from "react";
import { Dimensions , View, StyleSheet } from "react-native";
import { Gesture, GestureDetector } from "react-native-gesture-handler";

const {height: SCREEN_HEIGHT} = Dimensions.get('window');

const BottomSheet = (props) => {
    const [translateY, setTranslateY] = useState(-SCREEN_HEIGHT/3)
    const [prevY, setPrevY] = useState(0);
    const gesture = Gesture.Pan().onStart(()=>{setPrevY(translateY)}).onUpdate((event)=> {
        setTranslateY(Math.max(event.translationY + prevY, -SCREEN_HEIGHT + 15));
    }).onEnd(()=>{
        if(translateY > -SCREEN_HEIGHT/8) {
            setTranslateY(0)
            props.setClosed(false)
        }
    })

    return <GestureDetector gesture={gesture}>
    <View style={[styles.bottomSheetContainer, {transform:[ {translateY: translateY}]}]}>
        <View style={styles.line}/>
        <View style={{display:"flex"}}>
            {props.children}
        </View>
    </View>
    </GestureDetector>

};

const styles = StyleSheet.create({
    bottomSheetContainer : {
        height: SCREEN_HEIGHT + 15,
        backgroundColor: "white",
        shadowColor: "#858585",
        shadowRadius: 1,
        width : "100%",
        position: "absolute",
        top: SCREEN_HEIGHT,
        borderTopLeftRadius: 20,
        borderTopRightRadius: 20,
        borderStyle: "solid",
        borderWidth: 5,
        borderColor: "#FFD24C"
    },
    line : {
        width : 100,
        height: 4,
        backgroundColor: "grey",
        alignSelf: "center",
        marginVertical : 20,
        borderRadius: 2,
    }
});

export default BottomSheet;

