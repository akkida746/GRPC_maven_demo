package com.example.grpc;

import com.example.grpc.GreetingServiceGrpc.GreetingServiceBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class MyGrpcClient {

	public static void main(String[] args) {

		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8282)
		        .usePlaintext(true)
		        .build();

		GreetingServiceGrpc.GreetingServiceBlockingStub stub =
		        GreetingServiceGrpc.newBlockingStub(channel);
		
		HelloResponse helloResponse = stub.greeting(
		        HelloRequest.newBuilder()
		            .setName("Ray")
		            .build());

		    System.out.println(helloResponse);

		    channel.shutdown();
	}

}
