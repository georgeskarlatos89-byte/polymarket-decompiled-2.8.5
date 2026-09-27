package io.intercom.android.sdk.blocks;

import io.intercom.android.sdk.blocks.Video;
import io.intercom.android.sdk.blocks.views.VideoPreviewView;
import okhttp3.Callback;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoPreviewView b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Callback e;

    public /* synthetic */ a(Callback callback, VideoPreviewView videoPreviewView, String str, String str2, int i) {
        this.a = i;
        this.e = callback;
        this.b = videoPreviewView;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.d;
        String str2 = this.c;
        VideoPreviewView videoPreviewView = this.b;
        Callback callback = this.e;
        switch (i) {
            case 0:
                Video.AnonymousClass2.a((Video.AnonymousClass2) callback, videoPreviewView, str2, str);
                return;
            default:
                Video.AnonymousClass3.a((Video.AnonymousClass3) callback, videoPreviewView, str2, str);
                return;
        }
    }
}
