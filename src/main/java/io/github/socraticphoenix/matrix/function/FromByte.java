package io.github.socraticphoenix.matrix.function;
public interface FromByte {
    interface ToObject<A> { A apply(byte a); } 
    interface ToVoid { void apply(byte a); } 
    interface ToBoolean { boolean apply(byte a); } 
    interface ToByte { byte apply(byte a); } 
    interface ToShort { short apply(byte a); } 
    interface ToChar { char apply(byte a); } 
    interface ToInt { int apply(byte a); } 
    interface ToLong { long apply(byte a); } 
    interface ToFloat { float apply(byte a); } 
    interface ToDouble { double apply(byte a); } 
    interface AndObject {
        interface ToObject<A, B> { A apply(byte a, B b); } 
        interface ToVoid<A> { void apply(byte a, A b); } 
        interface ToBoolean<A> { boolean apply(byte a, A b); } 
        interface ToByte<A> { byte apply(byte a, A b); } 
        interface ToShort<A> { short apply(byte a, A b); } 
        interface ToChar<A> { char apply(byte a, A b); } 
        interface ToInt<A> { int apply(byte a, A b); } 
        interface ToLong<A> { long apply(byte a, A b); } 
        interface ToFloat<A> { float apply(byte a, A b); } 
        interface ToDouble<A> { double apply(byte a, A b); } 
    }
    interface AndBoolean {
        interface ToObject<A> { A apply(byte a, boolean b); } 
        interface ToVoid { void apply(byte a, boolean b); } 
        interface ToBoolean { boolean apply(byte a, boolean b); } 
        interface ToByte { byte apply(byte a, boolean b); } 
        interface ToShort { short apply(byte a, boolean b); } 
        interface ToChar { char apply(byte a, boolean b); } 
        interface ToInt { int apply(byte a, boolean b); } 
        interface ToLong { long apply(byte a, boolean b); } 
        interface ToFloat { float apply(byte a, boolean b); } 
        interface ToDouble { double apply(byte a, boolean b); } 
    }
    interface AndByte {
        interface ToObject<A> { A apply(byte a, byte b); } 
        interface ToVoid { void apply(byte a, byte b); } 
        interface ToBoolean { boolean apply(byte a, byte b); } 
        interface ToByte { byte apply(byte a, byte b); } 
        interface ToShort { short apply(byte a, byte b); } 
        interface ToChar { char apply(byte a, byte b); } 
        interface ToInt { int apply(byte a, byte b); } 
        interface ToLong { long apply(byte a, byte b); } 
        interface ToFloat { float apply(byte a, byte b); } 
        interface ToDouble { double apply(byte a, byte b); } 
    }
    interface AndShort {
        interface ToObject<A> { A apply(byte a, short b); } 
        interface ToVoid { void apply(byte a, short b); } 
        interface ToBoolean { boolean apply(byte a, short b); } 
        interface ToByte { byte apply(byte a, short b); } 
        interface ToShort { short apply(byte a, short b); } 
        interface ToChar { char apply(byte a, short b); } 
        interface ToInt { int apply(byte a, short b); } 
        interface ToLong { long apply(byte a, short b); } 
        interface ToFloat { float apply(byte a, short b); } 
        interface ToDouble { double apply(byte a, short b); } 
    }
    interface AndChar {
        interface ToObject<A> { A apply(byte a, char b); } 
        interface ToVoid { void apply(byte a, char b); } 
        interface ToBoolean { boolean apply(byte a, char b); } 
        interface ToByte { byte apply(byte a, char b); } 
        interface ToShort { short apply(byte a, char b); } 
        interface ToChar { char apply(byte a, char b); } 
        interface ToInt { int apply(byte a, char b); } 
        interface ToLong { long apply(byte a, char b); } 
        interface ToFloat { float apply(byte a, char b); } 
        interface ToDouble { double apply(byte a, char b); } 
    }
    interface AndInt {
        interface ToObject<A> { A apply(byte a, int b); } 
        interface ToVoid { void apply(byte a, int b); } 
        interface ToBoolean { boolean apply(byte a, int b); } 
        interface ToByte { byte apply(byte a, int b); } 
        interface ToShort { short apply(byte a, int b); } 
        interface ToChar { char apply(byte a, int b); } 
        interface ToInt { int apply(byte a, int b); } 
        interface ToLong { long apply(byte a, int b); } 
        interface ToFloat { float apply(byte a, int b); } 
        interface ToDouble { double apply(byte a, int b); } 
    }
    interface AndLong {
        interface ToObject<A> { A apply(byte a, long b); } 
        interface ToVoid { void apply(byte a, long b); } 
        interface ToBoolean { boolean apply(byte a, long b); } 
        interface ToByte { byte apply(byte a, long b); } 
        interface ToShort { short apply(byte a, long b); } 
        interface ToChar { char apply(byte a, long b); } 
        interface ToInt { int apply(byte a, long b); } 
        interface ToLong { long apply(byte a, long b); } 
        interface ToFloat { float apply(byte a, long b); } 
        interface ToDouble { double apply(byte a, long b); } 
    }
    interface AndFloat {
        interface ToObject<A> { A apply(byte a, float b); } 
        interface ToVoid { void apply(byte a, float b); } 
        interface ToBoolean { boolean apply(byte a, float b); } 
        interface ToByte { byte apply(byte a, float b); } 
        interface ToShort { short apply(byte a, float b); } 
        interface ToChar { char apply(byte a, float b); } 
        interface ToInt { int apply(byte a, float b); } 
        interface ToLong { long apply(byte a, float b); } 
        interface ToFloat { float apply(byte a, float b); } 
        interface ToDouble { double apply(byte a, float b); } 
    }
    interface AndDouble {
        interface ToObject<A> { A apply(byte a, double b); } 
        interface ToVoid { void apply(byte a, double b); } 
        interface ToBoolean { boolean apply(byte a, double b); } 
        interface ToByte { byte apply(byte a, double b); } 
        interface ToShort { short apply(byte a, double b); } 
        interface ToChar { char apply(byte a, double b); } 
        interface ToInt { int apply(byte a, double b); } 
        interface ToLong { long apply(byte a, double b); } 
        interface ToFloat { float apply(byte a, double b); } 
        interface ToDouble { double apply(byte a, double b); } 
    }
}