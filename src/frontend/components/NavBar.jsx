import { StyleSheet, Text, View,TouchableOpacity,Dimensions } from 'react-native'
import Ionicons from '@expo/vector-icons/Ionicons'
import FontAwesome from '@expo/vector-icons/Ionicons'
import { useNavigation } from '@react-navigation/native';

const windowWidth = Dimensions.get('window').width;

export default function NavBar() {

    const navigation = useNavigation();

    return (
        <View style={styles.nav}>
            <TouchableOpacity style={styles.btn} onPress={navigation.navigate("Profile",{user:{name: "kati", age: 22}})}>
                <FontAwesome name="home" size={28} color="white" />
                <Text>My profile</Text>
            </TouchableOpacity>
            <TouchableOpacity style={styles.btn}>
                <FontAwesome name="book" size={28} color="white" />
                <Text>My cources</Text>
            </TouchableOpacity>
            <TouchableOpacity style={styles.btn}>
                <Ionicons name="md-settings-outline" size={28} color="white" />
                <Text>Settings</Text>
            </TouchableOpacity>
        </View>
    )
}

const styles = StyleSheet.create({
    nav:{
        backgroundColor:"#a8cfe8",
        height:62,
        width:"100%",
        position:"absolute",
        bottom:0,
        flex:1,
        flexDirection:"row",
        alignItems: 'center',
        justifyContent: 'space-around'
    },
    btn:{
        width: windowWidth/3 -15,
        justifyContent:"center",
        alignItems:"center",
        bottom:2    
    }
})