package io.github.socraticphoenix.matrix.function;
public interface FromBoolean {
    interface ToObject<A> { A apply(boolean a); } 
    interface ToVoid { void apply(boolean a); } 
    interface ToBoolean { boolean apply(boolean a); } 
    interface ToByte { byte apply(boolean a); } 
    interface ToShort { short apply(boolean a); } 
    interface ToChar { char apply(boolean a); } 
    interface ToInt { int apply(boolean a); } 
    interface ToLong { long apply(boolean a); } 
    interface ToFloat { float apply(boolean a); } 
    interface ToDouble { double apply(boolean a); } 
    interface AndObject {
        interface ToObject<A, B> { A apply(boolean a, B b); } 
        interface ToVoid<A> { void apply(boolean a, A b); } 
        interface ToBoolean<A> { boolean apply(boolean a, A b); } 
        interface ToByte<A> { byte apply(boolean a, A b); } 
        interface ToShort<A> { short apply(boolean a, A b); } 
        interface ToChar<A> { char apply(boolean a, A b); } 
        interface ToInt<A> { int apply(boolean a, A b); } 
        interface ToLong<A> { long apply(boolean a, A b); } 
        interface ToFloat<A> { float apply(boolean a, A b); } 
        interface ToDouble<A> { double apply(boolean a, A b); } 
    }
    interface AndBoolean {
        interface ToObject<A> { A apply(boolean a, boolean b); } 
        interface ToVoid { void apply(boolean a, boolean b); } 
        interface ToBoolean { boolean apply(boolean a, boolean b); } 
        interface ToByte { byte apply(boolean a, boolean b); } 
        interface ToShort { short apply(boolean a, boolean b); } 
        interface ToChar { char apply(boolean a, boolean b); } 
        interface ToInt { int apply(boolean a, boolean b); } 
        interface ToLong { long apply(boolean a, boolean b); } 
        interface ToFloat { float apply(boolean a, boolean b); } 
        interface ToDouble { double apply(boolean a, boolean b); } 
    }
    interface AndByte {
        interface ToObject<A> { A apply(boolean a, byte b); } 
        interface ToVoid { void apply(boolean a, byte b); } 
        interface ToBoolean { boolean apply(boolean a, byte b); } 
        interface ToByte { byte apply(boolean a, byte b); } 
        interface ToShort { short apply(boolean a, byte b); } 
        interface ToChar { char apply(boolean a, byte b); } 
        interface ToInt { int apply(boolean a, byte b); } 
        interface ToLong { long apply(boolean a, byte b); } 
        interface ToFloat { float apply(boolean a, byte b); } 
        interface ToDouble { double apply(boolean a, byte b); } 
    }
    interface AndShort {
        interface ToObject<A> { A apply(boolean a, short b); } 
        interface ToVoid { void apply(boolean a, short b); } 
        interface ToBoolean { boolean apply(boolean a, short b); } 
        interface ToByte { byte apply(boolean a, short b); } 
        interface ToShort { short apply(boolean a, short b); } 
        interface ToChar { char apply(boolean a, short b); } 
        interface ToInt { int apply(boolean a, short b); } 
        interface ToLong { long apply(boolean a, short b); } 
        interface ToFloat { float apply(boolean a, short b); } 
        interface ToDouble { double apply(boolean a, short b); } 
    }
    interface AndChar {
        interface ToObject<A> { A apply(boolean a, char b); } 
        interface ToVoid { void apply(boolean a, char b); } 
        interface ToBoolean { boolean apply(boolean a, char b); } 
        interface ToByte { byte apply(boolean a, char b); } 
        interface ToShort { short apply(boolean a, char b); } 
        interface ToChar { char apply(boolean a, char b); } 
        interface ToInt { int apply(boolean a, char b); } 
        interface ToLong { long apply(boolean a, char b); } 
        interface ToFloat { float apply(boolean a, char b); } 
        interface ToDouble { double apply(boolean a, char b); } 
    }
    interface AndInt {
        interface ToObject<A> { A apply(boolean a, int b); } 
        interface ToVoid { void apply(boolean a, int b); } 
        interface ToBoolean { boolean apply(boolean a, int b); } 
        interface ToByte { byte apply(boolean a, int b); } 
        interface ToShort { short apply(boolean a, int b); } 
        interface ToChar { char apply(boolean a, int b); } 
        interface ToInt { int apply(boolean a, int b); } 
        interface ToLong { long apply(boolean a, int b); } 
        interface ToFloat { float apply(boolean a, int b); } 
        interface ToDouble { double apply(boolean a, int b); } 
    }
    interface AndLong {
        interface ToObject<A> { A apply(boolean a, long b); } 
        interface ToVoid { void apply(boolean a, long b); } 
        interface ToBoolean { boolean apply(boolean a, long b); } 
        interface ToByte { byte apply(boolean a, long b); } 
        interface ToShort { short apply(boolean a, long b); } 
        interface ToChar { char apply(boolean a, long b); } 
        interface ToInt { int apply(boolean a, long b); } 
        interface ToLong { long apply(boolean a, long b); } 
        interface ToFloat { float apply(boolean a, long b); } 
        interface ToDouble { double apply(boolean a, long b); } 
    }
    interface AndFloat {
        interface ToObject<A> { A apply(boolean a, float b); } 
        interface ToVoid { void apply(boolean a, float b); } 
        interface ToBoolean { boolean apply(boolean a, float b); } 
        interface ToByte { byte apply(boolean a, float b); } 
        interface ToShort { short apply(boolean a, float b); } 
        interface ToChar { char apply(boolean a, float b); } 
        interface ToInt { int apply(boolean a, float b); } 
        interface ToLong { long apply(boolean a, float b); } 
        interface ToFloat { float apply(boolean a, float b); } 
        interface ToDouble { double apply(boolean a, float b); } 
    }
    interface AndDouble {
        interface ToObject<A> { A apply(boolean a, double b); } 
        interface ToVoid { void apply(boolean a, double b); } 
        interface ToBoolean { boolean apply(boolean a, double b); } 
        interface ToByte { byte apply(boolean a, double b); } 
        interface ToShort { short apply(boolean a, double b); } 
        interface ToChar { char apply(boolean a, double b); } 
        interface ToInt { int apply(boolean a, double b); } 
        interface ToLong { long apply(boolean a, double b); } 
        interface ToFloat { float apply(boolean a, double b); } 
        interface ToDouble { double apply(boolean a, double b); } 
    }
}