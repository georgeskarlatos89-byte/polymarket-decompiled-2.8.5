package com.socure.idplus.device.internal.utils;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract class c {
    public static boolean a() {
        try {
            Class.forName("react.React");
            return true;
        } catch (ClassNotFoundException e) {
            e.getMessage();
            com.socure.idplus.device.internal.logger.a aVar = com.socure.idplus.device.internal.logger.a.D;
            return false;
        }
    }
}
