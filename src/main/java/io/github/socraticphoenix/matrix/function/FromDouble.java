package io.github.socraticphoenix.matrix.function;
public interface FromDouble {
    interface ToObject<A> extends FromAny.ToObject { A apply(double a); } 
    interface ToVoid extends FromAny.ToVoid { void apply(double a); } 
    interface ToBoolean extends FromAny.ToBoolean { boolean apply(double a); } 
    interface ToByte extends FromAny.ToByte { byte apply(double a); } 
    interface ToShort extends FromAny.ToShort { short apply(double a); } 
    interface ToChar extends FromAny.ToChar { char apply(double a); } 
    interface ToInt extends FromAny.ToInt { int apply(double a); } 
    interface ToLong extends FromAny.ToLong { long apply(double a); } 
    interface ToFloat extends FromAny.ToFloat { float apply(double a); } 
    interface ToDouble extends FromAny.ToDouble { double apply(double a); } 
    interface AndObject {
        interface ToObject<A, B> extends FromAny.ToObject { A apply(double a, B b); } 
        interface ToVoid<A> extends FromAny.ToVoid { void apply(double a, A b); } 
        interface ToBoolean<A> extends FromAny.ToBoolean { boolean apply(double a, A b); } 
        interface ToByte<A> extends FromAny.ToByte { byte apply(double a, A b); } 
        interface ToShort<A> extends FromAny.ToShort { short apply(double a, A b); } 
        interface ToChar<A> extends FromAny.ToChar { char apply(double a, A b); } 
        interface ToInt<A> extends FromAny.ToInt { int apply(double a, A b); } 
        interface ToLong<A> extends FromAny.ToLong { long apply(double a, A b); } 
        interface ToFloat<A> extends FromAny.ToFloat { float apply(double a, A b); } 
        interface ToDouble<A> extends FromAny.ToDouble { double apply(double a, A b); } 
    }
    interface AndBoolean {
        interface ToObject<A> extends FromAny.ToObject { A apply(double a, boolean b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(double a, boolean b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(double a, boolean b); } 
        interface ToByte extends FromAny.ToByte { byte apply(double a, boolean b); } 
        interface ToShort extends FromAny.ToShort { short apply(double a, boolean b); } 
        interface ToChar extends FromAny.ToChar { char apply(double a, boolean b); } 
        interface ToInt extends FromAny.ToInt { int apply(double a, boolean b); } 
        interface ToLong extends FromAny.ToLong { long apply(double a, boolean b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(double a, boolean b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(double a, boolean b); } 
    }
    interface AndByte {
        interface ToObject<A> extends FromAny.ToObject { A apply(double a, byte b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(double a, byte b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(double a, byte b); } 
        interface ToByte extends FromAny.ToByte { byte apply(double a, byte b); } 
        interface ToShort extends FromAny.ToShort { short apply(double a, byte b); } 
        interface ToChar extends FromAny.ToChar { char apply(double a, byte b); } 
        interface ToInt extends FromAny.ToInt { int apply(double a, byte b); } 
        interface ToLong extends FromAny.ToLong { long apply(double a, byte b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(double a, byte b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(double a, byte b); } 
    }
    interface AndShort {
        interface ToObject<A> extends FromAny.ToObject { A apply(double a, short b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(double a, short b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(double a, short b); } 
        interface ToByte extends FromAny.ToByte { byte apply(double a, short b); } 
        interface ToShort extends FromAny.ToShort { short apply(double a, short b); } 
        interface ToChar extends FromAny.ToChar { char apply(double a, short b); } 
        interface ToInt extends FromAny.ToInt { int apply(double a, short b); } 
        interface ToLong extends FromAny.ToLong { long apply(double a, short b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(double a, short b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(double a, short b); } 
    }
    interface AndChar {
        interface ToObject<A> extends FromAny.ToObject { A apply(double a, char b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(double a, char b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(double a, char b); } 
        interface ToByte extends FromAny.ToByte { byte apply(double a, char b); } 
        interface ToShort extends FromAny.ToShort { short apply(double a, char b); } 
        interface ToChar extends FromAny.ToChar { char apply(double a, char b); } 
        interface ToInt extends FromAny.ToInt { int apply(double a, char b); } 
        interface ToLong extends FromAny.ToLong { long apply(double a, char b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(double a, char b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(double a, char b); } 
    }
    interface AndInt {
        interface ToObject<A> extends FromAny.ToObject { A apply(double a, int b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(double a, int b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(double a, int b); } 
        interface ToByte extends FromAny.ToByte { byte apply(double a, int b); } 
        interface ToShort extends FromAny.ToShort { short apply(double a, int b); } 
        interface ToChar extends FromAny.ToChar { char apply(double a, int b); } 
        interface ToInt extends FromAny.ToInt { int apply(double a, int b); } 
        interface ToLong extends FromAny.ToLong { long apply(double a, int b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(double a, int b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(double a, int b); } 
    }
    interface AndLong {
        interface ToObject<A> extends FromAny.ToObject { A apply(double a, long b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(double a, long b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(double a, long b); } 
        interface ToByte extends FromAny.ToByte { byte apply(double a, long b); } 
        interface ToShort extends FromAny.ToShort { short apply(double a, long b); } 
        interface ToChar extends FromAny.ToChar { char apply(double a, long b); } 
        interface ToInt extends FromAny.ToInt { int apply(double a, long b); } 
        interface ToLong extends FromAny.ToLong { long apply(double a, long b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(double a, long b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(double a, long b); } 
    }
    interface AndFloat {
        interface ToObject<A> extends FromAny.ToObject { A apply(double a, float b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(double a, float b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(double a, float b); } 
        interface ToByte extends FromAny.ToByte { byte apply(double a, float b); } 
        interface ToShort extends FromAny.ToShort { short apply(double a, float b); } 
        interface ToChar extends FromAny.ToChar { char apply(double a, float b); } 
        interface ToInt extends FromAny.ToInt { int apply(double a, float b); } 
        interface ToLong extends FromAny.ToLong { long apply(double a, float b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(double a, float b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(double a, float b); } 
    }
    interface AndDouble {
        interface ToObject<A> extends FromAny.ToObject { A apply(double a, double b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(double a, double b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(double a, double b); } 
        interface ToByte extends FromAny.ToByte { byte apply(double a, double b); } 
        interface ToShort extends FromAny.ToShort { short apply(double a, double b); } 
        interface ToChar extends FromAny.ToChar { char apply(double a, double b); } 
        interface ToInt extends FromAny.ToInt { int apply(double a, double b); } 
        interface ToLong extends FromAny.ToLong { long apply(double a, double b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(double a, double b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(double a, double b); } 
    }
}