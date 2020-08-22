package com.loohp.tournament.Packets;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import com.loohp.tournament.Utils.DataTypeIO;

public class PacketOutReportFinish extends PacketOut {
	
	public static int packetId = 0x02;
	
	public int getPacketId() {
		return packetId;
	}
	
	private String text;
	
	public PacketOutReportFinish(String text) {
		this.text = text;
	}
	
	public String getText() {
		return text;
	}

	public byte[] getBytes() throws IOException {
		ByteArrayOutputStream buffer = new ByteArrayOutputStream();
		
		DataOutputStream output = new DataOutputStream(buffer);
		output.writeByte(packetId);
		DataTypeIO.writeString(output, text, StandardCharsets.UTF_8);
		
		return buffer.toByteArray();
	}

}
