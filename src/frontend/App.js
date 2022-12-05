import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, TouchableOpacity, View } from 'react-native';
import Form from './components/form/Form';
import { MOCK_DATA_UNEDITABLE } from './test/FormMockDataConstants';

export default function App() {
  return (
    <View style={styles.container}>
      <Form data={MOCK_DATA_UNEDITABLE}/>
      <TouchableOpacity/>
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
