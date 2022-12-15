import { StyleSheet, Text, View, Image, ScrollView, Dimensions} from 'react-native'
import React from 'react'

const { width, height } = Dimensions.get('window')

export default function UserCard({user}) {
    return (
        <View>
            <View style={styles.header}>
                <Image
                    style={styles.profilePicture}
                    source={require('../../assets/john.png')}
                    resizeMode="contain"
                />
            </View>
            <ScrollView
                style={{height: height * 0.65}}
            >
                <View style={styles.data}>
                    <Text>Име : </Text>
                    <Text>{user.name}</Text>
                </View>
                <View style={styles.data}>
                    <Text>Факултетен номер : </Text>
                    <Text>{user.userId}</Text>
                </View>
                <View style={styles.data}>
                    <Text>Факултет : </Text>
                    <Text>{user.faculty}</Text>
                </View>
                <View style={styles.data}>
                    <Text>Специалност : </Text>
                    <Text>{user.program}</Text>
                </View>
                <View style={styles.data}>
                    <Text>Вид обучение : </Text>
                    <Text>{user.formOfEducation}</Text>
                </View>
                <View style={styles.data}>
                    <Text>Прием : </Text>
                    <Text>{user.priem}</Text>
                </View>
                <View style={styles.data}>
                    <Text>ОКС : </Text>
                    <Text>{user.OKS}</Text>
                </View>
                <View style={styles.data}>
                    <Text>Имейл : </Text>
                    <Text>{user.email}</Text>
                </View>
                <View style={styles.data}>
                    <Text>Състояние : </Text>
                    <Text>{user.status}</Text>
                </View>
                <View style={styles.data}>
                    <Text>Записан семестър : </Text>
                    <Text>{user.semester}</Text>
                </View>
                <View style={styles.data}>
                    <Text>Заверен семестър : </Text>
                    <Text>{user.certifiedSem}</Text>
                </View>
                <View style={styles.data}>
                    <Text>Поток : </Text>
                    <Text>{user.subgroup}</Text>
                </View>
                <View style={styles.data}>
                    <Text>Група : </Text>
                    <Text>{user.group}</Text>
                </View>
                <View style={styles.data}>
                    <Text>Основна специалност : </Text>
                    <Text>{user.mainPr}</Text>
                </View>
                <View style={styles.data}>
                    <Text>Имейл в ТУ : </Text>
                    <Text>{user.tusmail}</Text>
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
      },
      scrollView: {
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
        height:70,
        borderBottomColor:"#a8cfe8",
        borderBottomWidth:3

    },
})