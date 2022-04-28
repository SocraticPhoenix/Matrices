package io.github.socraticphoenix.matrix.function;
public interface FromLong {
    interface ToObject<A> extends FromAny.ToObject { A apply(long a); } 
    interface ToVoid extends FromAny.ToVoid { void apply(long a); } 
    interface ToBoolean extends FromAny.ToBoolean { boolean apply(long a); } 
    interface ToByte extends FromAny.ToByte { byte apply(long a); } 
    interface ToShort extends FromAny.ToShort { short apply(long a); } 
    interface ToChar extends FromAny.ToChar { char apply(long a); } 
    interface ToInt extends FromAny.ToInt { int apply(long a); } 
    interface ToLong extends FromAny.ToLong { long apply(long a); } 
    interface ToFloat extends FromAny.ToFloat { float apply(long a); } 
    interface ToDouble extends FromAny.ToDouble { double apply(long a); } 
    interface AndObject {
        interface ToObject<A, B> extends FromAny.ToObject { A apply(long a, B b); } 
        interface ToVoid<A> extends FromAny.ToVoid { void apply(long a, A b); } 
        interface ToBoolean<A> extends FromAny.ToBoolean { boolean apply(long a, A b); } 
        interface ToByte<A> extends FromAny.ToByte { byte apply(long a, A b); } 
        interface ToShort<A> extends FromAny.ToShort { short apply(long a, A b); } 
        interface ToChar<A> extends FromAny.ToChar { char apply(long a, A b); } 
        interface ToInt<A> extends FromAny.ToInt { int apply(long a, A b); } 
        interface ToLong<A> extends FromAny.ToLong { long apply(long a, A b); } 
        interface ToFloat<A> extends FromAny.ToFloat { float apply(long a, A b); } 
        interface ToDouble<A> extends FromAny.ToDouble { double apply(long a, A b); } 
    }
    interface AndBoolean {
        interface ToObject<A> extends FromAny.ToObject { A apply(long a, boolean b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(long a, boolean b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(long a, boolean b); } 
        interface ToByte extends FromAny.ToByte { byte apply(long a, boolean b); } 
        interface ToShort extends FromAny.ToShort { short apply(long a, boolean b); } 
        interface ToChar extends FromAny.ToChar { char apply(long a, boolean b); } 
        interface ToInt extends FromAny.ToInt { int apply(long a, boolean b); } 
        interface ToLong extends FromAny.ToLong { long apply(long a, boolean b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(long a, boolean b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(long a, boolean b); } 
    }
    interface AndByte {
        interface ToObject<A> extends FromAny.ToObject { A apply(long a, byte b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(long a, byte b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(long a, byte b); } 
        interface ToByte extends FromAny.ToByte { byte apply(long a, byte b); } 
        interface ToShort extends FromAny.ToShort { short apply(long a, byte b); } 
        interface ToChar extends FromAny.ToChar { char apply(long a, byte b); } 
        interface ToInt extends FromAny.ToInt { int apply(long a, byte b); } 
        interface ToLong extends FromAny.ToLong { long apply(long a, byte b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(long a, byte b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(long a, byte b); } 
    }
    interface AndShort {
        interface ToObject<A> extends FromAny.ToObject { A apply(long a, short b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(long a, short b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(long a, short b); } 
        interface ToByte extends FromAny.ToByte { byte apply(long a, short b); } 
        interface ToShort extends FromAny.ToShort { short apply(long a, short b); } 
        interface ToChar extends FromAny.ToChar { char apply(long a, short b); } 
        interface ToInt extends FromAny.ToInt { int apply(long a, short b); } 
        interface ToLong extends FromAny.ToLong { long apply(long a, short b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(long a, short b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(long a, short b); } 
    }
    interface AndChar {
        interface ToObject<A> extends FromAny.ToObject { A apply(long a, char b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(long a, char b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(long a, char b); } 
        interface ToByte extends FromAny.ToByte { byte apply(long a, char b); } 
        interface ToShort extends FromAny.ToShort { short apply(long a, char b); } 
        interface ToChar extends FromAny.ToChar { char apply(long a, char b); } 
        interface ToInt extends FromAny.ToInt { int apply(long a, char b); } 
        interface ToLong extends FromAny.ToLong { long apply(long a, char b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(long a, char b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(long a, char b); } 
    }
    interface AndInt {
        interface ToObject<A> extends FromAny.ToObject { A apply(long a, int b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(long a, int b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(long a, int b); } 
        interface ToByte extends FromAny.ToByte { byte apply(long a, int b); } 
        interface ToShort extends FromAny.ToShort { short apply(long a, int b); } 
        interface ToChar extends FromAny.ToChar { char apply(long a, int b); } 
        interface ToInt extends FromAny.ToInt { int apply(long a, int b); } 
        interface ToLong extends FromAny.ToLong { long apply(long a, int b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(long a, int b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(long a, int b); } 
    }
    interface AndLong {
        interface ToObject<A> extends FromAny.ToObject { A apply(long a, long b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(long a, long b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(long a, long b); } 
        interface ToByte extends FromAny.ToByte { byte apply(long a, long b); } 
        interface ToShort extends FromAny.ToShort { short apply(long a, long b); } 
        interface ToChar extends FromAny.ToChar { char apply(long a, long b); } 
        interface ToInt extends FromAny.ToInt { int apply(long a, long b); } 
        interface ToLong extends FromAny.ToLong { long apply(long a, long b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(long a, long b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(long a, long b); } 
    }
    interface AndFloat {
        interface ToObject<A> extends FromAny.ToObject { A apply(long a, float b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(long a, float b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(long a, float b); } 
        interface ToByte extends FromAny.ToByte { byte apply(long a, float b); } 
        interface ToShort extends FromAny.ToShort { short apply(long a, float b); } 
        interface ToChar extends FromAny.ToChar { char apply(long a, float b); } 
        interface ToInt extends FromAny.ToInt { int apply(long a, float b); } 
        interface ToLong extends FromAny.ToLong { long apply(long a, float b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(long a, float b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(long a, float b); } 
    }
    interface AndDouble {
        interface ToObject<A> extends FromAny.ToObject { A apply(long a, double b); } 
        interface ToVoid extends FromAny.ToVoid { void apply(long a, double b); } 
        interface ToBoolean extends FromAny.ToBoolean { boolean apply(long a, double b); } 
        interface ToByte extends FromAny.ToByte { byte apply(long a, double b); } 
        interface ToShort extends FromAny.ToShort { short apply(long a, double b); } 
        interface ToChar extends FromAny.ToChar { char apply(long a, double b); } 
        interface ToInt extends FromAny.ToInt { int apply(long a, double b); } 
        interface ToLong extends FromAny.ToLong { long apply(long a, double b); } 
        interface ToFloat extends FromAny.ToFloat { float apply(long a, double b); } 
        interface ToDouble extends FromAny.ToDouble { double apply(long a, double b); } 
    }
}