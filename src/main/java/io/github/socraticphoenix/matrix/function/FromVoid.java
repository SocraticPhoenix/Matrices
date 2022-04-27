package io.github.socraticphoenix.matrix.function;
public interface FromVoid {
    interface ToObject<A> { A apply(); } 
    interface ToVoid { void apply(); } 
    interface ToBoolean { boolean apply(); } 
    interface ToByte { byte apply(); } 
    interface ToShort { short apply(); } 
    interface ToChar { char apply(); } 
    interface ToInt { int apply(); } 
    interface ToLong { long apply(); } 
    interface ToFloat { float apply(); } 
    interface ToDouble { double apply(); } 
}