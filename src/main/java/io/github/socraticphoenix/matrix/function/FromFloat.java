package io.github.socraticphoenix.matrix.function;
public interface FromFloat {
    interface ToObject<A> { A apply(float a); } 
    interface ToVoid { void apply(float a); } 
    interface ToBoolean { boolean apply(float a); } 
    interface ToByte { byte apply(float a); } 
    interface ToShort { short apply(float a); } 
    interface ToChar { char apply(float a); } 
    interface ToInt { int apply(float a); } 
    interface ToLong { long apply(float a); } 
    interface ToFloat { float apply(float a); } 
    interface ToDouble { double apply(float a); } 
    interface AndObject {
        interface ToObject<A, B> { A apply(float a, B b); } 
        interface ToVoid<A> { void apply(float a, A b); } 
        interface ToBoolean<A> { boolean apply(float a, A b); } 
        interface ToByte<A> { byte apply(float a, A b); } 
        interface ToShort<A> { short apply(float a, A b); } 
        interface ToChar<A> { char apply(float a, A b); } 
        interface ToInt<A> { int apply(float a, A b); } 
        interface ToLong<A> { long apply(float a, A b); } 
        interface ToFloat<A> { float apply(float a, A b); } 
        interface ToDouble<A> { double apply(float a, A b); } 
    }
    interface AndBoolean {
        interface ToObject<A> { A apply(float a, boolean b); } 
        interface ToVoid { void apply(float a, boolean b); } 
        interface ToBoolean { boolean apply(float a, boolean b); } 
        interface ToByte { byte apply(float a, boolean b); } 
        interface ToShort { short apply(float a, boolean b); } 
        interface ToChar { char apply(float a, boolean b); } 
        interface ToInt { int apply(float a, boolean b); } 
        interface ToLong { long apply(float a, boolean b); } 
        interface ToFloat { float apply(float a, boolean b); } 
        interface ToDouble { double apply(float a, boolean b); } 
    }
    interface AndByte {
        interface ToObject<A> { A apply(float a, byte b); } 
        interface ToVoid { void apply(float a, byte b); } 
        interface ToBoolean { boolean apply(float a, byte b); } 
        interface ToByte { byte apply(float a, byte b); } 
        interface ToShort { short apply(float a, byte b); } 
        interface ToChar { char apply(float a, byte b); } 
        interface ToInt { int apply(float a, byte b); } 
        interface ToLong { long apply(float a, byte b); } 
        interface ToFloat { float apply(float a, byte b); } 
        interface ToDouble { double apply(float a, byte b); } 
    }
    interface AndShort {
        interface ToObject<A> { A apply(float a, short b); } 
        interface ToVoid { void apply(float a, short b); } 
        interface ToBoolean { boolean apply(float a, short b); } 
        interface ToByte { byte apply(float a, short b); } 
        interface ToShort { short apply(float a, short b); } 
        interface ToChar { char apply(float a, short b); } 
        interface ToInt { int apply(float a, short b); } 
        interface ToLong { long apply(float a, short b); } 
        interface ToFloat { float apply(float a, short b); } 
        interface ToDouble { double apply(float a, short b); } 
    }
    interface AndChar {
        interface ToObject<A> { A apply(float a, char b); } 
        interface ToVoid { void apply(float a, char b); } 
        interface ToBoolean { boolean apply(float a, char b); } 
        interface ToByte { byte apply(float a, char b); } 
        interface ToShort { short apply(float a, char b); } 
        interface ToChar { char apply(float a, char b); } 
        interface ToInt { int apply(float a, char b); } 
        interface ToLong { long apply(float a, char b); } 
        interface ToFloat { float apply(float a, char b); } 
        interface ToDouble { double apply(float a, char b); } 
    }
    interface AndInt {
        interface ToObject<A> { A apply(float a, int b); } 
        interface ToVoid { void apply(float a, int b); } 
        interface ToBoolean { boolean apply(float a, int b); } 
        interface ToByte { byte apply(float a, int b); } 
        interface ToShort { short apply(float a, int b); } 
        interface ToChar { char apply(float a, int b); } 
        interface ToInt { int apply(float a, int b); } 
        interface ToLong { long apply(float a, int b); } 
        interface ToFloat { float apply(float a, int b); } 
        interface ToDouble { double apply(float a, int b); } 
    }
    interface AndLong {
        interface ToObject<A> { A apply(float a, long b); } 
        interface ToVoid { void apply(float a, long b); } 
        interface ToBoolean { boolean apply(float a, long b); } 
        interface ToByte { byte apply(float a, long b); } 
        interface ToShort { short apply(float a, long b); } 
        interface ToChar { char apply(float a, long b); } 
        interface ToInt { int apply(float a, long b); } 
        interface ToLong { long apply(float a, long b); } 
        interface ToFloat { float apply(float a, long b); } 
        interface ToDouble { double apply(float a, long b); } 
    }
    interface AndFloat {
        interface ToObject<A> { A apply(float a, float b); } 
        interface ToVoid { void apply(float a, float b); } 
        interface ToBoolean { boolean apply(float a, float b); } 
        interface ToByte { byte apply(float a, float b); } 
        interface ToShort { short apply(float a, float b); } 
        interface ToChar { char apply(float a, float b); } 
        interface ToInt { int apply(float a, float b); } 
        interface ToLong { long apply(float a, float b); } 
        interface ToFloat { float apply(float a, float b); } 
        interface ToDouble { double apply(float a, float b); } 
    }
    interface AndDouble {
        interface ToObject<A> { A apply(float a, double b); } 
        interface ToVoid { void apply(float a, double b); } 
        interface ToBoolean { boolean apply(float a, double b); } 
        interface ToByte { byte apply(float a, double b); } 
        interface ToShort { short apply(float a, double b); } 
        interface ToChar { char apply(float a, double b); } 
        interface ToInt { int apply(float a, double b); } 
        interface ToLong { long apply(float a, double b); } 
        interface ToFloat { float apply(float a, double b); } 
        interface ToDouble { double apply(float a, double b); } 
    }
}