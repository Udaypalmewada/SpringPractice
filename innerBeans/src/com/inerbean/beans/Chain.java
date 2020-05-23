package com.inerbean.beans;

public class Chain {
private int id;
private String chainType;
public void setId(int id) {
	this.id = id;
}
public void setChainType(String chainType) {
	this.chainType = chainType;
}
@Override
public String toString() {
	return "Chain [id=" + id + ", chainType=" + chainType + "]";
}

}
