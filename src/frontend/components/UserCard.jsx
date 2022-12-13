import { StyleSheet, Text, View, Image, ScrollView, Dimensions} from 'react-native'
import React from 'react'

const { width, height } = Dimensions.get('window')

export default function UserCard({user}) {
    return (
        <View >
            <View style={styles.header}>
                <Image
                    style={styles.profilePicture}
                    source={require('../../assets/ty.jpg')}
                    resizeMode="contain"
                />
            </View>
            <ScrollView
                style={{height: height * 0.7 + 62}}
            >
                <View style={styles.data}>
                    <Text>Име : </Text>
                    <Text>{user.name}</Text>
                </View>
                <View style={styles.data}>
                    <Text>Факултетен номер : </Text>
                    <Text>{user.name}</Text>
                </View>
                <View style={styles.data}>
                    <Text>Факултет : </Text>
                    <Text>{user.name}</Text>
                </View>
                <View style={styles.data}>
                    <Text>Специалност : </Text>
                    <Text>{user.name}</Text>
                </View>
                <View style={styles.data}>
                    <Text>Вид обучение : </Text>
                    <Text>{user.name}</Text>
                </View>
                <View style={styles.data}>
                    <Text>Прием : </Text>
                    <Text>{user.name}</Text>
                </View>
                <View style={styles.data}>
                    <Text>ОКС : </Text>
                    <Text>{user.name}</Text>
                </View>
                <View style={styles.data}>
                    <Text>Имейл : </Text>
                    <Text>{user.name}</Text>
                </View>
                <View style={styles.data}>
                    <Text>Състояние : </Text>
                    <Text>{user.name}</Text>
                </View>
                <View style={styles.data}>
                    <Text>Записан семестър : </Text>
                    <Text>{user.name}</Text>
                </View>
                <View style={styles.data}>
                    <Text>Заверен семестър : </Text>
                    <Text>{user.name}</Text>
                </View>
                <View style={styles.data}>
                    <Text>Поток : </Text>
                    <Text>{user.name}</Text>
                </View>
                <View style={styles.data}>
                    <Text>Група : </Text>
                    <Text>{user.name}</Text>
                </View>
                <View style={styles.data}>
                    <Text>Основна специалност : </Text>
                    <Text>{user.name}</Text>
                </View>
                <View style={styles.data}>
                    <Text>Имейл в ТУ : </Text>
                    <Text>{user.name}</Text>
                </View>
            </ScrollView>
        </View>
    )
}

const styles = StyleSheet.create({
    container:{
        flex:1,
        flexDirection:"column",
        alignItems:"center",
        justifyContent:"flex-start"
    },
    container: {
        flex: 1,
        // paddingTop: StatusBar.currentHeight,
      },
      scrollView: {
        backgroundColor: 'pink',
        marginHorizontal: 20,
      },
      text: {
        fontSize: 42,
      },
    profilePicture:{
        width: 160,
        height: 160,
        borderRadius: 80,
    },
    header:{
        width:"100%",
        height: height * 0.3,
        backgroundColor: "#a8cfe8",
        alignItems: "center",
        justifyContent: "center"
    }, 
    data:{
        width:"100%",
        height:80,
        borderBottomColor:"#a8cfe8",
        borderBottomWidth:3

    },
    dataList:{
        marginBottom:50,
        backgroundColor:"red"
    }
})