package io.github.socraticphoenix.matrix.function;
public interface FromFloat {
    interface ToObject<A> extends FromAny.ToObject { A apply(float a); } 
    interface ToVoid extends FromAny.ToVoid { void apply(float a); } 
    interface ToBoolean extends FromAny.ToBoolean { boolean apply(float a); } 
    interface ToByte extends FromAny.ToByte { byte apply(float a); } 
    interface ToShort extends FromAny.ToShort { short apply(float a); } 
    interface ToChar extends FromAny.ToChar { char apply(float a); } 
    interface ToInt extends FromAny.ToInt { int apply(float a); } 
    interface ToLong extends FromAny.ToLong { long apply(float a); } 
    interface ToFloat extends FromAny.ToFloat { float apply(float a); } 
    interface ToDouble extends FromAny.ToDouble { double apply(float a); } 
    interface AndObject {
        interface ToObject<A, B> extends FromAny.ToObject { A apply(float a, B b); } 
        interface ToVoid<A> extends FromAny.ToVoid { void apply(float a, A b); } 
        interface ToBoolean<A> extends FromAny.ToBoolean { boolean apply(float a, A b); } 
        interface ToByte<A> extends FromAny.ToByte { byte apply(float a, A b); } 
        interface ToShort<A> extends FromAny.ToShort { short apply(float a, A b); } 
        interface ToChar<A> extends FromAny.ToChar { char apply(float a, A b); } 
        interface ToInt<A> extends FromAny.ToInt { int apply(float a, A b); } 
        interface ToLong<A> extends FromAny.ToLong { long apply(float a, A b); } 
        interface ToFloat<A> extends FromAny.ToFloat { float apply(float a, A b); } 
        interface ToDouble<A> extends FromAny.ToDouble { double apply(float a, A b); } 
    }
    interface AndBoolean {
        interface ToObject<A> extends FromAny.ToObject { A apply(float a, boolean b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(float a, boolean b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(float a, boolean b); } 
        interface ToByte extends FromAny.ToByte { byte apply(float a, boolean b); } 
        interface ToShort extends FromAny.ToShort { short apply(float a, boolean b); } 
        interface ToChar extends FromAny.ToChar { char apply(float a, boolean b); } 
        interface ToInt extends FromAny.ToInt { int apply(float a, boolean b); } 
        interface ToLong extends FromAny.ToLong { long apply(float a, boolean b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(float a, boolean b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(float a, boolean b); } 
    }
    interface AndByte {
        interface ToObject<A> extends FromAny.ToObject { A apply(float a, byte b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(float a, byte b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(float a, byte b); } 
        interface ToByte extends FromAny.ToByte { byte apply(float a, byte b); } 
        interface ToShort extends FromAny.ToShort { short apply(float a, byte b); } 
        interface ToChar extends FromAny.ToChar { char apply(float a, byte b); } 
        interface ToInt extends FromAny.ToInt { int apply(float a, byte b); } 
        interface ToLong extends FromAny.ToLong { long apply(float a, byte b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(float a, byte b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(float a, byte b); } 
    }
    interface AndShort {
        interface ToObject<A> extends FromAny.ToObject { A apply(float a, short b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(float a, short b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(float a, short b); } 
        interface ToByte extends FromAny.ToByte { byte apply(float a, short b); } 
        interface ToShort extends FromAny.ToShort { short apply(float a, short b); } 
        interface ToChar extends FromAny.ToChar { char apply(float a, short b); } 
        interface ToInt extends FromAny.ToInt { int apply(float a, short b); } 
        interface ToLong extends FromAny.ToLong { long apply(float a, short b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(float a, short b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(float a, short b); } 
    }
    interface AndChar {
        interface ToObject<A> extends FromAny.ToObject { A apply(float a, char b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(float a, char b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(float a, char b); } 
        interface ToByte extends FromAny.ToByte { byte apply(float a, char b); } 
        interface ToShort extends FromAny.ToShort { short apply(float a, char b); } 
        interface ToChar extends FromAny.ToChar { char apply(float a, char b); } 
        interface ToInt extends FromAny.ToInt { int apply(float a, char b); } 
        interface ToLong extends FromAny.ToLong { long apply(float a, char b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(float a, char b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(float a, char b); } 
    }
    interface AndInt {
        interface ToObject<A> extends FromAny.ToObject { A apply(float a, int b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(float a, int b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(float a, int b); } 
        interface ToByte extends FromAny.ToByte { byte apply(float a, int b); } 
        interface ToShort extends FromAny.ToShort { short apply(float a, int b); } 
        interface ToChar extends FromAny.ToChar { char apply(float a, int b); } 
        interface ToInt extends FromAny.ToInt { int apply(float a, int b); } 
        interface ToLong extends FromAny.ToLong { long apply(float a, int b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(float a, int b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(float a, int b); } 
    }
    interface AndLong {
        interface ToObject<A> extends FromAny.ToObject { A apply(float a, long b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(float a, long b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(float a, long b); } 
        interface ToByte extends FromAny.ToByte { byte apply(float a, long b); } 
        interface ToShort extends FromAny.ToShort { short apply(float a, long b); } 
        interface ToChar extends FromAny.ToChar { char apply(float a, long b); } 
        interface ToInt extends FromAny.ToInt { int apply(float a, long b); } 
        interface ToLong extends FromAny.ToLong { long apply(float a, long b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(float a, long b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(float a, long b); } 
    }
    interface AndFloat {
        interface ToObject<A> extends FromAny.ToObject { A apply(float a, float b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(float a, float b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(float a, float b); } 
        interface ToByte extends FromAny.ToByte { byte apply(float a, float b); } 
        interface ToShort extends FromAny.ToShort { short apply(float a, float b); } 
        interface ToChar extends FromAny.ToChar { char apply(float a, float b); } 
        interface ToInt extends FromAny.ToInt { int apply(float a, float b); } 
        interface ToLong extends FromAny.ToLong { long apply(float a, float b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(float a, float b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(float a, float b); } 
    }
    interface AndDouble {
        interface ToObject<A> extends FromAny.ToObject { A apply(float a, double b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(float a, double b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(float a, double b); } 
        interface ToByte extends FromAny.ToByte { byte apply(float a, double b); } 
        interface ToShort extends FromAny.ToShort { short apply(float a, double b); } 
        interface ToChar extends FromAny.ToChar { char apply(float a, double b); } 
        interface ToInt extends FromAny.ToInt { int apply(float a, double b); } 
        interface ToLong extends FromAny.ToLong { long apply(float a, double b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(float a, double b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(float a, double b); } 
    }
}