package io.github.socraticphoenix.matrix.function;
public interface FromByte {
    interface ToObject<A> extends FromAny.ToObject { A apply(byte a); } 
    interface ToVoid extends FromAny.ToVoid { void apply(byte a); } 
    interface ToBoolean extends FromAny.ToBoolean { boolean apply(byte a); } 
    interface ToByte extends FromAny.ToByte { byte apply(byte a); } 
    interface ToShort extends FromAny.ToShort { short apply(byte a); } 
    interface ToChar extends FromAny.ToChar { char apply(byte a); } 
    interface ToInt extends FromAny.ToInt { int apply(byte a); } 
    interface ToLong extends FromAny.ToLong { long apply(byte a); } 
    interface ToFloat extends FromAny.ToFloat { float apply(byte a); } 
    interface ToDouble extends FromAny.ToDouble { double apply(byte a); } 
    interface AndObject {
        interface ToObject<A, B> extends FromAny.ToObject { A apply(byte a, B b); } 
        interface ToVoid<A> extends FromAny.ToVoid { void apply(byte a, A b); } 
        interface ToBoolean<A> extends FromAny.ToBoolean { boolean apply(byte a, A b); } 
        interface ToByte<A> extends FromAny.ToByte { byte apply(byte a, A b); } 
        interface ToShort<A> extends FromAny.ToShort { short apply(byte a, A b); } 
        interface ToChar<A> extends FromAny.ToChar { char apply(byte a, A b); } 
        interface ToInt<A> extends FromAny.ToInt { int apply(byte a, A b); } 
        interface ToLong<A> extends FromAny.ToLong { long apply(byte a, A b); } 
        interface ToFloat<A> extends FromAny.ToFloat { float apply(byte a, A b); } 
        interface ToDouble<A> extends FromAny.ToDouble { double apply(byte a, A b); } 
    }
    interface AndBoolean {
        interface ToObject<A> extends FromAny.ToObject { A apply(byte a, boolean b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(byte a, boolean b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(byte a, boolean b); } 
        interface ToByte extends FromAny.ToByte { byte apply(byte a, boolean b); } 
        interface ToShort extends FromAny.ToShort { short apply(byte a, boolean b); } 
        interface ToChar extends FromAny.ToChar { char apply(byte a, boolean b); } 
        interface ToInt extends FromAny.ToInt { int apply(byte a, boolean b); } 
        interface ToLong extends FromAny.ToLong { long apply(byte a, boolean b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(byte a, boolean b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(byte a, boolean b); } 
    }
    interface AndByte {
        interface ToObject<A> extends FromAny.ToObject { A apply(byte a, byte b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(byte a, byte b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(byte a, byte b); } 
        interface ToByte extends FromAny.ToByte { byte apply(byte a, byte b); } 
        interface ToShort extends FromAny.ToShort { short apply(byte a, byte b); } 
        interface ToChar extends FromAny.ToChar { char apply(byte a, byte b); } 
        interface ToInt extends FromAny.ToInt { int apply(byte a, byte b); } 
        interface ToLong extends FromAny.ToLong { long apply(byte a, byte b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(byte a, byte b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(byte a, byte b); } 
    }
    interface AndShort {
        interface ToObject<A> extends FromAny.ToObject { A apply(byte a, short b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(byte a, short b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(byte a, short b); } 
        interface ToByte extends FromAny.ToByte { byte apply(byte a, short b); } 
        interface ToShort extends FromAny.ToShort { short apply(byte a, short b); } 
        interface ToChar extends FromAny.ToChar { char apply(byte a, short b); } 
        interface ToInt extends FromAny.ToInt { int apply(byte a, short b); } 
        interface ToLong extends FromAny.ToLong { long apply(byte a, short b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(byte a, short b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(byte a, short b); } 
    }
    interface AndChar {
        interface ToObject<A> extends FromAny.ToObject { A apply(byte a, char b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(byte a, char b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(byte a, char b); } 
        interface ToByte extends FromAny.ToByte { byte apply(byte a, char b); } 
        interface ToShort extends FromAny.ToShort { short apply(byte a, char b); } 
        interface ToChar extends FromAny.ToChar { char apply(byte a, char b); } 
        interface ToInt extends FromAny.ToInt { int apply(byte a, char b); } 
        interface ToLong extends FromAny.ToLong { long apply(byte a, char b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(byte a, char b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(byte a, char b); } 
    }
    interface AndInt {
        interface ToObject<A> extends FromAny.ToObject { A apply(byte a, int b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(byte a, int b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(byte a, int b); } 
        interface ToByte extends FromAny.ToByte { byte apply(byte a, int b); } 
        interface ToShort extends FromAny.ToShort { short apply(byte a, int b); } 
        interface ToChar extends FromAny.ToChar { char apply(byte a, int b); } 
        interface ToInt extends FromAny.ToInt { int apply(byte a, int b); } 
        interface ToLong extends FromAny.ToLong { long apply(byte a, int b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(byte a, int b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(byte a, int b); } 
    }
    interface AndLong {
        interface ToObject<A> extends FromAny.ToObject { A apply(byte a, long b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(byte a, long b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(byte a, long b); } 
        interface ToByte extends FromAny.ToByte { byte apply(byte a, long b); } 
        interface ToShort extends FromAny.ToShort { short apply(byte a, long b); } 
        interface ToChar extends FromAny.ToChar { char apply(byte a, long b); } 
        interface ToInt extends FromAny.ToInt { int apply(byte a, long b); } 
        interface ToLong extends FromAny.ToLong { long apply(byte a, long b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(byte a, long b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(byte a, long b); } 
    }
    interface AndFloat {
        interface ToObject<A> extends FromAny.ToObject { A apply(byte a, float b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(byte a, float b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(byte a, float b); } 
        interface ToByte extends FromAny.ToByte { byte apply(byte a, float b); } 
        interface ToShort extends FromAny.ToShort { short apply(byte a, float b); } 
        interface ToChar extends FromAny.ToChar { char apply(byte a, float b); } 
        interface ToInt extends FromAny.ToInt { int apply(byte a, float b); } 
        interface ToLong extends FromAny.ToLong { long apply(byte a, float b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(byte a, float b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(byte a, float b); } 
    }
    interface AndDouble {
        interface ToObject<A> extends FromAny.ToObject { A apply(byte a, double b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(byte a, double b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(byte a, double b); } 
        interface ToByte extends FromAny.ToByte { byte apply(byte a, double b); } 
        interface ToShort extends FromAny.ToShort { short apply(byte a, double b); } 
        interface ToChar extends FromAny.ToChar { char apply(byte a, double b); } 
        interface ToInt extends FromAny.ToInt { int apply(byte a, double b); } 
        interface ToLong extends FromAny.ToLong { long apply(byte a, double b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(byte a, double b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(byte a, double b); } 
    }
}