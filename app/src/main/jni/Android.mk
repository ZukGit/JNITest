LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := zukgit
LOCAL_SRC_FILES := jnizukgit.c

include $(BUILD_SHARED_LIBRARY)