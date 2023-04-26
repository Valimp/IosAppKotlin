//
//  CounterView.swift
//  iosApp
//
//  Created by Les Prodiges on 26/04/2023.
//  Copyright © 2023 orgName. All rights reserved.
//

import SwiftUI
import KMMViewModelSwiftUI
import oucaKit

struct CounterView: View {
    @StateViewModel var viewModel = CounterViewModel()

    var body: some View {
        VStack(spacing: 16) {
            Text("Count: \(viewModel.count)")
                .font(.title)
                .fontWeight(.bold)
            
            Button(action: {
                viewModel.incrementCount()
            }) {
                Text("Increment")
                    .font(.headline)
                    .foregroundColor(.white)
                    .padding()
                    .background(Color.blue)
                    .cornerRadius(10)
            }
            Button(action: {
                viewModel.decrementCount()
            }) {
                Text("Decrement")
                    .font(.headline)
                    .foregroundColor(.white)
                    .padding()
                    .background(Color.blue)
                    .cornerRadius(10)
            }
            Button(action: {
                viewModel.resetCount()
            }) {
                Text("Reset")
                    .font(.headline)
                    .foregroundColor(.white)
                    .padding()
                    .background(Color.blue)
                    .cornerRadius(10)
            }
        }
        .padding()
    }
}

struct CounterView_Previews: PreviewProvider {
    static var previews: some View {
        CounterView()
    }
}
