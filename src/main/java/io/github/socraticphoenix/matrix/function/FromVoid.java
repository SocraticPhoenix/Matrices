package io.github.socraticphoenix.matrix.function;
public interface FromVoid {
    interface ToObject<A> extends FromAny.ToObject { A apply(); } 
    interface ToVoid extends FromAny.ToVoid { void apply(); } 
    interface ToBoolean extends FromAny.ToBoolean { boolean apply(); } 
    interface ToByte extends FromAny.ToByte { byte apply(); } 
    interface ToShort extends FromAny.ToShort { short apply(); } 
    interface ToChar extends FromAny.ToChar { char apply(); } 
    interface ToInt extends FromAny.ToInt { int apply(); } 
    interface ToLong extends FromAny.ToLong { long apply(); } 
    interface ToFloat extends FromAny.ToFloat { float apply(); } 
    interface ToDouble extends FromAny.ToDouble { double apply(); } 
}