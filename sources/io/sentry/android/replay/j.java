package io.sentry.android.replay;

import com.socure.docv.capturesdk.common.utils.Scanner;
import defpackage.dgn;
import defpackage.lwg;
import defpackage.tl0;
import io.sentry.p5;
import io.sentry.p6;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class j implements Closeable {
    public final p6 a;
    public final io.sentry.protocol.w b;
    public final AtomicBoolean c;
    public final io.sentry.util.a d;
    public final io.sentry.util.a e;
    public final io.sentry.util.a f;
    public io.sentry.android.replay.video.d g;
    public final Lazy h;
    public final ArrayList i;
    public final LinkedHashMap j;
    public final Lazy k;

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, io.sentry.util.a] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, io.sentry.util.a] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, io.sentry.util.a] */
    public j(p6 p6Var, io.sentry.protocol.w wVar) {
        p6Var.getClass();
        wVar.getClass();
        this.a = p6Var;
        this.b = wVar;
        this.c = new AtomicBoolean(false);
        this.d = new Object();
        this.e = new Object();
        this.f = new Object();
        this.h = LazyKt.lazy(new h(this, 1));
        this.i = new ArrayList();
        this.j = new LinkedHashMap();
        this.k = LazyKt.lazy(new h(this, 0));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AtomicBoolean atomicBoolean = this.c;
        try {
            io.sentry.util.a aVar = this.d;
            if (!aVar.g().tryLock(Scanner.CAMERA_SETUP_DELAY_MS, TimeUnit.MILLISECONDS)) {
                aVar = null;
            }
            if (aVar == null) {
                this.a.getLogger().f(p5.WARNING, "Timed out waiting for the video encoder, skipping its release to not block the caller", new Object[0]);
            } else {
                try {
                    io.sentry.android.replay.video.d dVar = this.g;
                    if (dVar != null) {
                        dVar.c();
                    }
                    this.g = null;
                    dgn.a(aVar, null);
                } finally {
                }
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } finally {
            atomicBoolean.set(true);
        }
    }

    public final void e(File file, long j, String str) {
        k kVar = new k(file, j, str);
        io.sentry.util.a aVar = this.f;
        aVar.e();
        try {
            this.i.add(kVar);
            dgn.a(aVar, null);
        } finally {
        }
    }

    public final void g(File file) {
        p6 p6Var = this.a;
        try {
            if (!file.delete()) {
                p6Var.getLogger().f(p5.ERROR, "Failed to delete replay frame: %s", file.getAbsolutePath());
            }
        } catch (Throwable th) {
            p6Var.getLogger().b(p5.ERROR, th, "Failed to delete replay frame: %s", file.getAbsolutePath());
        }
    }

    public final File o() {
        return (File) this.h.getValue();
    }

    public final void p(String str, String str2) {
        File file;
        File file2;
        Lazy lazy = this.k;
        LinkedHashMap linkedHashMap = this.j;
        io.sentry.util.a aVar = this.e;
        aVar.e();
        try {
            if (this.c.get()) {
                dgn.a(aVar, null);
                return;
            }
            File file3 = (File) lazy.getValue();
            if ((file3 == null || !file3.exists()) && (file = (File) lazy.getValue()) != null) {
                file.createNewFile();
            }
            if (linkedHashMap.isEmpty() && (file2 = (File) lazy.getValue()) != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2), Charsets.UTF_8), 8192);
                try {
                    Iterator it = lwg.c(new tl0(bufferedReader, 3)).iterator();
                    while (it.hasNext()) {
                        List d0 = StringsKt.d0((String) it.next(), new String[]{"="}, false, 2, 2);
                        Pair pair = new Pair((String) d0.get(0), (String) d0.get(1));
                        linkedHashMap.put(pair.getFirst(), pair.getSecond());
                    }
                    bufferedReader.close();
                } finally {
                }
            }
            if (str2 == null) {
                linkedHashMap.remove(str);
            } else {
                linkedHashMap.put(str, str2);
            }
            File file4 = (File) lazy.getValue();
            if (file4 != null) {
                Set entrySet = linkedHashMap.entrySet();
                entrySet.getClass();
                FilesKt.i(file4, CollectionsKt.N(entrySet, "\n", null, null, b.j, 30));
            }
            dgn.a(aVar, null);
        } finally {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.internal.Ref$ObjectRef] */
    public final String y(long j) {
        ?? obj = new Object();
        io.sentry.util.a aVar = this.f;
        aVar.e();
        try {
            CollectionsKt.n0(this.i, new i(j, this, obj));
            dgn.a(aVar, null);
            return (String) obj.a;
        } finally {
        }
    }
}
