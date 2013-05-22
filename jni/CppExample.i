%module CppModule

%include <std_string.i>

%{
#include "CppExample.h"
%}

%include "CppExample.h"
