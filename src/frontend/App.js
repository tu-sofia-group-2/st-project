import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, TouchableOpacity, View } from 'react-native';
import Form from './components/form/Form';
import { MOCK_DATA_UNEDITABLE } from './test/FormMockDataConstants';
//import ButtonType from '@storybook/addon-knobs/dist/components/types/Button';
import Button from './components/Button';
import InputFields from './components/InputFields';
import UserForm from './components/UserForm';
import UserFormWrapper from './components/UserFormWrapper';
export default function App() {
  return (
    <View style={styles.container}>
      <Form data={MOCK_DATA_UNEDITABLE}/>
      <TouchableOpacity/>
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
