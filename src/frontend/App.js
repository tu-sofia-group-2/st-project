import { StatusBar } from 'expo-status-bar';
//export {default} from "./storybook";
import { StyleSheet, Text, View } from 'react-native';
//import ButtonType from '@storybook/addon-knobs/dist/components/types/Button';
import Button from './components/Button';
import InputFields from './components/InputFields';
import UserForm from './components/UserForm';
import UserFormWrapper from './components/UserFormWrapper';
export default function App() {
  return (
    <View style={styles.container}>
      <Text>Open up App.js to start working on your app!</Text>
      <Button label = {"Button"}></Button>
      {/* <StatusBar style="auto" /> */}
      <UserFormWrapper/>
    </View>
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    width: "100%",
    padding: "3%",
    backgroundColor: '#f2f2f2',
    alignItems: 'center',
    justifyContent: 'center',
    alignSelf:"center"
  }
});
