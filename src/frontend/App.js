import { StatusBar } from 'expo-status-bar';
//export {default} from "./storybook";
import { StyleSheet, Text, View } from 'react-native';
//import ButtonType from '@storybook/addon-knobs/dist/components/types/Button';
import Button from './components/Button';
import InputFields from './components/InputFields';
import UserForm from './components/UserForm';
export default function App() {
  return (
    <View style={styles.container}>
      <Text>Open up App.js to start working on your app!</Text>
      <Button label = {"Button"}></Button>
      <InputFields defaultText = {"enter username"}></InputFields>
      {/* <StatusBar style="auto" /> */}
      <UserForm></UserForm>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
