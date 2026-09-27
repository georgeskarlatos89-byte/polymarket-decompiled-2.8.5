package defpackage;

import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class kb7 implements DefaultLifecycleObserver {
    public final /* synthetic */ p6b a;

    public kb7(EmojiCompatInitializer emojiCompatInitializer, p6b p6bVar) {
        this.a = p6bVar;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        is4.a(Looper.getMainLooper()).postDelayed(new mb7(0), 500L);
        this.a.c(this);
    }
}
