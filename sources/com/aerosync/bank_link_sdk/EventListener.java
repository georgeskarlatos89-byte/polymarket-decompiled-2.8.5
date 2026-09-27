package com.aerosync.bank_link_sdk;

import android.content.Context;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public interface EventListener {
    void onClose(Context context);

    void onError(String str, Context context);

    void onEvent(PayloadEventType payloadEventType, Context context);

    void onSuccess(PayloadSuccessType payloadSuccessType, Context context);
}
