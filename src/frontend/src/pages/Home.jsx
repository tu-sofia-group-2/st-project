import { StyleSheet, Text, View, Button } from 'react-native'
import { useState } from 'react';


function fun(i){

}

export default function Home({navigation}) {
    const [count, setCount] = useState(0)

    


    return (
        <>
            <View style={styles.container}>
                <Text>{count}</Text>
                <Button title='+' onPress={()=>{setCount(count + 1)}}/>
                <Button title='-' onPress={()=>{(count>0 && setCount(count-1))}}/>
                <Button title="go to login" onPress={()=>{navigation.navigate('Login')}}/>
    
            </View>
        </>
    )
}

const styles = StyleSheet.create({
    container:{
        flex: 1,
        justifyContent: "center",
        alignItems: "center",
    },
    containerRed:{
        flex: 1,
        justifyContent: "center",
        alignItems: "center",
        backgroundColor: "red"
    }
}) 