LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := cppmodule
LOCAL_SRC_FILES := CppExample.cpp CppExample_wrap.cpp 

include $(BUILD_SHARED_LIBRARY)
