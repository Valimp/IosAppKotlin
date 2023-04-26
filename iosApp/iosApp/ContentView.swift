import SwiftUI
import oucaKit

struct ContentView: View {
	let greet = Greeting().greet()

	var body: some View {
		CounterView()
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}
