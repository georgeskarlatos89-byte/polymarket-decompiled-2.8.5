package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class jb7 {
    public static final Object j = new Object();
    public static volatile jb7 k;
    public final ReentrantReadWriteLock a;
    public final ll0 b;
    public volatile int c;
    public final Handler d;
    public final fb7 e;
    public final ib7 f;
    public final qf5 g;
    public final int h;
    public final d46 i;

    public jb7(zh8 zh8Var) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        ib7 ib7Var = (ib7) zh8Var.b;
        this.f = ib7Var;
        int i = zh8Var.a;
        this.h = i;
        this.i = (d46) zh8Var.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new ll0();
        this.g = new qf5(4);
        fb7 fb7Var = new fb7(this);
        this.e = fb7Var;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (c() == 0) {
            try {
                ib7Var.c(new eb7(fb7Var));
            } catch (Throwable th2) {
                f(th2);
            }
        }
    }

    public static jb7 a() {
        jb7 jb7Var;
        boolean z;
        synchronized (j) {
            jb7Var = k;
            if (jb7Var != null) {
                z = true;
            } else {
                z = false;
            }
            grn.g("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", z);
        }
        return jb7Var;
    }

    public static boolean d() {
        if (k != null) {
            return true;
        }
        return false;
    }

    public final int b(CharSequence charSequence, int i) {
        boolean z = true;
        if (c() != 1) {
            z = false;
        }
        grn.g("Not initialized yet", z);
        grn.f(charSequence, "charSequence cannot be null");
        m64 m64Var = this.e.b;
        m64Var.getClass();
        if (i >= 0 && i < charSequence.length()) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                uij[] uijVarArr = (uij[]) spanned.getSpans(i, i + 1, uij.class);
                if (uijVarArr.length > 0) {
                    return spanned.getSpanStart(uijVarArr[0]);
                }
            }
            return ((wb7) m64Var.O(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), bd0.API_PRIORITY_OTHER, true, new wb7(i))).b;
        }
        return -1;
    }

    public final int c() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void e() {
        boolean z;
        if (this.h == 1) {
            z = true;
        } else {
            z = false;
        }
        grn.g("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading", z);
        if (c() == 1) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            fb7 fb7Var = this.e;
            jb7 jb7Var = fb7Var.a;
            try {
                jb7Var.f.c(new eb7(fb7Var));
            } catch (Throwable th) {
                jb7Var.f(th);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void f(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new hw2(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8 A[Catch: all -> 0x008b, TryCatch #2 {all -> 0x008b, blocks: (B:79:0x0063, B:82:0x0068, B:84:0x006c, B:86:0x0079, B:32:0x0098, B:34:0x00a2, B:36:0x00a5, B:38:0x00a8, B:40:0x00b8, B:41:0x00bb), top: B:78:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, yuj] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence g(int i, int i2, int i3, CharSequence charSequence) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        CharSequence charSequence2;
        Throwable th;
        int i4;
        int i5;
        uij[] uijVarArr;
        if (c() == 1) {
            z = true;
        } else {
            z = false;
        }
        grn.g("Not initialized yet", z);
        yuj yujVar = null;
        yujVar = null;
        if (i >= 0) {
            if (i2 >= 0) {
                if (i <= i2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                grn.b("start should be <= than end", z2);
                if (charSequence == null) {
                    return null;
                }
                if (i <= charSequence.length()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                grn.b("start should be < than charSequence length", z3);
                if (i2 <= charSequence.length()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                grn.b("end should be < than charSequence length", z4);
                if (charSequence.length() == 0 || i == i2) {
                    return charSequence;
                }
                if (i3 != 1) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                m64 m64Var = this.e.b;
                m64Var.getClass();
                boolean z6 = charSequence instanceof yfh;
                if (z6) {
                    ((yfh) charSequence).a();
                }
                try {
                    if (!z6) {
                        try {
                            if (!(charSequence instanceof Spannable)) {
                                if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, uij.class) <= i2) {
                                    ?? obj = new Object();
                                    obj.a = false;
                                    obj.b = new SpannableString(charSequence);
                                    yujVar = obj;
                                }
                                if (yujVar != null && (uijVarArr = (uij[]) yujVar.b.getSpans(i, i2, uij.class)) != null && uijVarArr.length > 0) {
                                    for (uij uijVar : uijVarArr) {
                                        int spanStart = yujVar.b.getSpanStart(uijVar);
                                        int spanEnd = yujVar.b.getSpanEnd(uijVar);
                                        if (spanStart != i2) {
                                            yujVar.removeSpan(uijVar);
                                        }
                                        i = Math.min(spanStart, i);
                                        i2 = Math.max(spanEnd, i2);
                                    }
                                }
                                i4 = i;
                                i5 = i2;
                                if (i4 != i5 || i4 >= charSequence.length()) {
                                    charSequence2 = charSequence;
                                    if (!z6) {
                                        return charSequence2;
                                    }
                                } else {
                                    charSequence2 = charSequence;
                                    try {
                                        yuj yujVar2 = (yuj) m64Var.O(charSequence2, i4, i5, bd0.API_PRIORITY_OTHER, z5, new bw4(19, yujVar, (qf5) m64Var.a));
                                        if (yujVar2 != null) {
                                            Spannable spannable = yujVar2.b;
                                            if (z6) {
                                                ((yfh) charSequence2).b();
                                            }
                                            return spannable;
                                        }
                                        if (!z6) {
                                            return charSequence2;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        th = th;
                                        if (z6) {
                                        }
                                    }
                                }
                                ((yfh) charSequence2).b();
                                return charSequence2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            charSequence2 = charSequence;
                            if (z6) {
                            }
                        }
                    }
                    yujVar = new yuj((Spannable) charSequence);
                    if (yujVar != null) {
                        while (r1 < r2) {
                        }
                    }
                    i4 = i;
                    i5 = i2;
                    if (i4 != i5) {
                    }
                    charSequence2 = charSequence;
                    if (!z6) {
                    }
                    ((yfh) charSequence2).b();
                    return charSequence2;
                } catch (Throwable th4) {
                    th = th4;
                    charSequence2 = charSequence;
                    th = th;
                    if (z6) {
                        ((yfh) charSequence2).b();
                        throw th;
                    }
                    throw th;
                }
            }
            dmk.v("end cannot be negative");
            return null;
        }
        dmk.v("start cannot be negative");
        return null;
    }

    public final void h(hb7 hb7Var) {
        this.a.writeLock().lock();
        try {
            if (this.c != 1 && this.c != 2) {
                this.b.add(hb7Var);
                this.a.writeLock().unlock();
            }
            this.d.post(new hw2(Arrays.asList(hb7Var), this.c, (Throwable) null));
            this.a.writeLock().unlock();
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public final void i(EditorInfo editorInfo) {
        int i;
        if (c() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        fb7 fb7Var = this.e;
        fb7Var.getClass();
        Bundle bundle = editorInfo.extras;
        ifc ifcVar = (ifc) fb7Var.c.b;
        int a = ifcVar.a(4);
        if (a != 0) {
            i = ((ByteBuffer) ifcVar.d).getInt(a + ifcVar.a);
        } else {
            i = 0;
        }
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
