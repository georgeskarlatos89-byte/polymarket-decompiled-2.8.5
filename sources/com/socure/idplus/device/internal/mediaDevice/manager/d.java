package com.socure.idplus.device.internal.mediaDevice.manager;

import android.content.Context;
import android.media.AudioManager;
import android.util.Log;
import com.socure.idplus.device.internal.utils.i;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class d {
    public static final String d = "d";
    public final Context a;
    public AudioManager b;
    public final c c;

    public d(Context context) {
        c cVar;
        context.getClass();
        this.a = context;
        if (i.a() >= 23) {
            cVar = new c(a());
        } else {
            cVar = null;
        }
        this.c = cVar;
    }

    public final AudioManager a() {
        AudioManager audioManager;
        AudioManager audioManager2 = this.b;
        if (audioManager2 != null) {
            return audioManager2;
        }
        try {
            Object systemService = this.a.getSystemService("audio");
            if (systemService instanceof AudioManager) {
                audioManager = (AudioManager) systemService;
            } else {
                audioManager = null;
            }
            this.b = audioManager;
            return audioManager;
        } catch (Exception e) {
            String str = d;
            String str2 = "Error getting AudioManager: " + e.getLocalizedMessage();
            str.getClass();
            int ordinal = com.socure.idplus.device.internal.logger.a.D.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    Log.i(str, str2);
                }
            } else {
                Log.e(str, str2);
            }
            return null;
        }
    }
}
