package io.github.socraticphoenix.matrix.function;
public interface FromShort {
    interface ToObject<A> { A apply(short a); } 
    interface ToVoid { void apply(short a); } 
    interface ToBoolean { boolean apply(short a); } 
    interface ToByte { byte apply(short a); } 
    interface ToShort { short apply(short a); } 
    interface ToChar { char apply(short a); } 
    interface ToInt { int apply(short a); } 
    interface ToLong { long apply(short a); } 
    interface ToFloat { float apply(short a); } 
    interface ToDouble { double apply(short a); } 
    interface AndObject {
        interface ToObject<A, B> { A apply(short a, B b); } 
        interface ToVoid<A> { void apply(short a, A b); } 
        interface ToBoolean<A> { boolean apply(short a, A b); } 
        interface ToByte<A> { byte apply(short a, A b); } 
        interface ToShort<A> { short apply(short a, A b); } 
        interface ToChar<A> { char apply(short a, A b); } 
        interface ToInt<A> { int apply(short a, A b); } 
        interface ToLong<A> { long apply(short a, A b); } 
        interface ToFloat<A> { float apply(short a, A b); } 
        interface ToDouble<A> { double apply(short a, A b); } 
    }
    interface AndBoolean {
        interface ToObject<A> { A apply(short a, boolean b); } 
        interface ToVoid { void apply(short a, boolean b); } 
        interface ToBoolean { boolean apply(short a, boolean b); } 
        interface ToByte { byte apply(short a, boolean b); } 
        interface ToShort { short apply(short a, boolean b); } 
        interface ToChar { char apply(short a, boolean b); } 
        interface ToInt { int apply(short a, boolean b); } 
        interface ToLong { long apply(short a, boolean b); } 
        interface ToFloat { float apply(short a, boolean b); } 
        interface ToDouble { double apply(short a, boolean b); } 
    }
    interface AndByte {
        interface ToObject<A> { A apply(short a, byte b); } 
        interface ToVoid { void apply(short a, byte b); } 
        interface ToBoolean { boolean apply(short a, byte b); } 
        interface ToByte { byte apply(short a, byte b); } 
        interface ToShort { short apply(short a, byte b); } 
        interface ToChar { char apply(short a, byte b); } 
        interface ToInt { int apply(short a, byte b); } 
        interface ToLong { long apply(short a, byte b); } 
        interface ToFloat { float apply(short a, byte b); } 
        interface ToDouble { double apply(short a, byte b); } 
    }
    interface AndShort {
        interface ToObject<A> { A apply(short a, short b); } 
        interface ToVoid { void apply(short a, short b); } 
        interface ToBoolean { boolean apply(short a, short b); } 
        interface ToByte { byte apply(short a, short b); } 
        interface ToShort { short apply(short a, short b); } 
        interface ToChar { char apply(short a, short b); } 
        interface ToInt { int apply(short a, short b); } 
        interface ToLong { long apply(short a, short b); } 
        interface ToFloat { float apply(short a, short b); } 
        interface ToDouble { double apply(short a, short b); } 
    }
    interface AndChar {
        interface ToObject<A> { A apply(short a, char b); } 
        interface ToVoid { void apply(short a, char b); } 
        interface ToBoolean { boolean apply(short a, char b); } 
        interface ToByte { byte apply(short a, char b); } 
        interface ToShort { short apply(short a, char b); } 
        interface ToChar { char apply(short a, char b); } 
        interface ToInt { int apply(short a, char b); } 
        interface ToLong { long apply(short a, char b); } 
        interface ToFloat { float apply(short a, char b); } 
        interface ToDouble { double apply(short a, char b); } 
    }
    interface AndInt {
        interface ToObject<A> { A apply(short a, int b); } 
        interface ToVoid { void apply(short a, int b); } 
        interface ToBoolean { boolean apply(short a, int b); } 
        interface ToByte { byte apply(short a, int b); } 
        interface ToShort { short apply(short a, int b); } 
        interface ToChar { char apply(short a, int b); } 
        interface ToInt { int apply(short a, int b); } 
        interface ToLong { long apply(short a, int b); } 
        interface ToFloat { float apply(short a, int b); } 
        interface ToDouble { double apply(short a, int b); } 
    }
    interface AndLong {
        interface ToObject<A> { A apply(short a, long b); } 
        interface ToVoid { void apply(short a, long b); } 
        interface ToBoolean { boolean apply(short a, long b); } 
        interface ToByte { byte apply(short a, long b); } 
        interface ToShort { short apply(short a, long b); } 
        interface ToChar { char apply(short a, long b); } 
        interface ToInt { int apply(short a, long b); } 
        interface ToLong { long apply(short a, long b); } 
        interface ToFloat { float apply(short a, long b); } 
        interface ToDouble { double apply(short a, long b); } 
    }
    interface AndFloat {
        interface ToObject<A> { A apply(short a, float b); } 
        interface ToVoid { void apply(short a, float b); } 
        interface ToBoolean { boolean apply(short a, float b); } 
        interface ToByte { byte apply(short a, float b); } 
        interface ToShort { short apply(short a, float b); } 
        interface ToChar { char apply(short a, float b); } 
        interface ToInt { int apply(short a, float b); } 
        interface ToLong { long apply(short a, float b); } 
        interface ToFloat { float apply(short a, float b); } 
        interface ToDouble { double apply(short a, float b); } 
    }
    interface AndDouble {
        interface ToObject<A> { A apply(short a, double b); } 
        interface ToVoid { void apply(short a, double b); } 
        interface ToBoolean { boolean apply(short a, double b); } 
        interface ToByte { byte apply(short a, double b); } 
        interface ToShort { short apply(short a, double b); } 
        interface ToChar { char apply(short a, double b); } 
        interface ToInt { int apply(short a, double b); } 
        interface ToLong { long apply(short a, double b); } 
        interface ToFloat { float apply(short a, double b); } 
        interface ToDouble { double apply(short a, double b); } 
    }
}