package io.github.socraticphoenix.matrix.function;
public interface FromDouble {
    interface ToObject<A> { A apply(double a); } 
    interface ToVoid { void apply(double a); } 
    interface ToBoolean { boolean apply(double a); } 
    interface ToByte { byte apply(double a); } 
    interface ToShort { short apply(double a); } 
    interface ToChar { char apply(double a); } 
    interface ToInt { int apply(double a); } 
    interface ToLong { long apply(double a); } 
    interface ToFloat { float apply(double a); } 
    interface ToDouble { double apply(double a); } 
    interface AndObject {
        interface ToObject<A, B> { A apply(double a, B b); } 
        interface ToVoid<A> { void apply(double a, A b); } 
        interface ToBoolean<A> { boolean apply(double a, A b); } 
        interface ToByte<A> { byte apply(double a, A b); } 
        interface ToShort<A> { short apply(double a, A b); } 
        interface ToChar<A> { char apply(double a, A b); } 
        interface ToInt<A> { int apply(double a, A b); } 
        interface ToLong<A> { long apply(double a, A b); } 
        interface ToFloat<A> { float apply(double a, A b); } 
        interface ToDouble<A> { double apply(double a, A b); } 
    }
    interface AndBoolean {
        interface ToObject<A> { A apply(double a, boolean b); } 
        interface ToVoid { void apply(double a, boolean b); } 
        interface ToBoolean { boolean apply(double a, boolean b); } 
        interface ToByte { byte apply(double a, boolean b); } 
        interface ToShort { short apply(double a, boolean b); } 
        interface ToChar { char apply(double a, boolean b); } 
        interface ToInt { int apply(double a, boolean b); } 
        interface ToLong { long apply(double a, boolean b); } 
        interface ToFloat { float apply(double a, boolean b); } 
        interface ToDouble { double apply(double a, boolean b); } 
    }
    interface AndByte {
        interface ToObject<A> { A apply(double a, byte b); } 
        interface ToVoid { void apply(double a, byte b); } 
        interface ToBoolean { boolean apply(double a, byte b); } 
        interface ToByte { byte apply(double a, byte b); } 
        interface ToShort { short apply(double a, byte b); } 
        interface ToChar { char apply(double a, byte b); } 
        interface ToInt { int apply(double a, byte b); } 
        interface ToLong { long apply(double a, byte b); } 
        interface ToFloat { float apply(double a, byte b); } 
        interface ToDouble { double apply(double a, byte b); } 
    }
    interface AndShort {
        interface ToObject<A> { A apply(double a, short b); } 
        interface ToVoid { void apply(double a, short b); } 
        interface ToBoolean { boolean apply(double a, short b); } 
        interface ToByte { byte apply(double a, short b); } 
        interface ToShort { short apply(double a, short b); } 
        interface ToChar { char apply(double a, short b); } 
        interface ToInt { int apply(double a, short b); } 
        interface ToLong { long apply(double a, short b); } 
        interface ToFloat { float apply(double a, short b); } 
        interface ToDouble { double apply(double a, short b); } 
    }
    interface AndChar {
        interface ToObject<A> { A apply(double a, char b); } 
        interface ToVoid { void apply(double a, char b); } 
        interface ToBoolean { boolean apply(double a, char b); } 
        interface ToByte { byte apply(double a, char b); } 
        interface ToShort { short apply(double a, char b); } 
        interface ToChar { char apply(double a, char b); } 
        interface ToInt { int apply(double a, char b); } 
        interface ToLong { long apply(double a, char b); } 
        interface ToFloat { float apply(double a, char b); } 
        interface ToDouble { double apply(double a, char b); } 
    }
    interface AndInt {
        interface ToObject<A> { A apply(double a, int b); } 
        interface ToVoid { void apply(double a, int b); } 
        interface ToBoolean { boolean apply(double a, int b); } 
        interface ToByte { byte apply(double a, int b); } 
        interface ToShort { short apply(double a, int b); } 
        interface ToChar { char apply(double a, int b); } 
        interface ToInt { int apply(double a, int b); } 
        interface ToLong { long apply(double a, int b); } 
        interface ToFloat { float apply(double a, int b); } 
        interface ToDouble { double apply(double a, int b); } 
    }
    interface AndLong {
        interface ToObject<A> { A apply(double a, long b); } 
        interface ToVoid { void apply(double a, long b); } 
        interface ToBoolean { boolean apply(double a, long b); } 
        interface ToByte { byte apply(double a, long b); } 
        interface ToShort { short apply(double a, long b); } 
        interface ToChar { char apply(double a, long b); } 
        interface ToInt { int apply(double a, long b); } 
        interface ToLong { long apply(double a, long b); } 
        interface ToFloat { float apply(double a, long b); } 
        interface ToDouble { double apply(double a, long b); } 
    }
    interface AndFloat {
        interface ToObject<A> { A apply(double a, float b); } 
        interface ToVoid { void apply(double a, float b); } 
        interface ToBoolean { boolean apply(double a, float b); } 
        interface ToByte { byte apply(double a, float b); } 
        interface ToShort { short apply(double a, float b); } 
        interface ToChar { char apply(double a, float b); } 
        interface ToInt { int apply(double a, float b); } 
        interface ToLong { long apply(double a, float b); } 
        interface ToFloat { float apply(double a, float b); } 
        interface ToDouble { double apply(double a, float b); } 
    }
    interface AndDouble {
        interface ToObject<A> { A apply(double a, double b); } 
        interface ToVoid { void apply(double a, double b); } 
        interface ToBoolean { boolean apply(double a, double b); } 
        interface ToByte { byte apply(double a, double b); } 
        interface ToShort { short apply(double a, double b); } 
        interface ToChar { char apply(double a, double b); } 
        interface ToInt { int apply(double a, double b); } 
        interface ToLong { long apply(double a, double b); } 
        interface ToFloat { float apply(double a, double b); } 
        interface ToDouble { double apply(double a, double b); } 
    }
}