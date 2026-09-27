package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class b8l implements Cloneable {
    public final d8l a;
    public d8l b;

    public b8l(d8l d8lVar) {
        this.a = d8lVar;
        if (!d8lVar.e()) {
            this.b = d8lVar.g();
        } else {
            dmk.v("Default instance must be immutable.");
            throw null;
        }
    }

    public static void a(List list, int i) {
        int size = list.size() - i;
        StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 26);
        sb.append("Element at index ");
        sb.append(size);
        sb.append(" is null.");
        String sb2 = sb.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 >= i) {
                list.remove(size2);
            } else {
                throw new NullPointerException(sb2);
            }
        }
    }

    public static void b(Iterable iterable, List list) {
        iterable.getClass();
        if (iterable instanceof r8l) {
            List zza = ((r8l) iterable).zza();
            r8l r8lVar = (r8l) list;
            int size = list.size();
            for (Object obj : zza) {
                if (obj == null) {
                    int size2 = r8lVar.size() - size;
                    StringBuilder sb = new StringBuilder(String.valueOf(size2).length() + 26);
                    sb.append("Element at index ");
                    sb.append(size2);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    int size3 = r8lVar.size();
                    while (true) {
                        size3--;
                        if (size3 >= size) {
                            r8lVar.remove(size3);
                        } else {
                            dmk.s(sb2);
                            return;
                        }
                    }
                } else if (obj instanceof i7l) {
                    r8lVar.zzb();
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    i7l.j(bArr, 0, bArr.length);
                    r8lVar.zzb();
                } else {
                    r8lVar.add((String) obj);
                }
            }
            return;
        }
        if (!(iterable instanceof l9l)) {
            if (iterable instanceof Collection) {
                int size4 = ((Collection) iterable).size();
                if (list instanceof ArrayList) {
                    ((ArrayList) list).ensureCapacity(list.size() + size4);
                } else if (list instanceof n9l) {
                    n9l n9lVar = (n9l) list;
                    int i = n9lVar.c + size4;
                    int length = n9lVar.b.length;
                    if (i > length) {
                        if (length != 0) {
                            while (length < i) {
                                length = Math.max(((length * 3) / 2) + 1, 10);
                            }
                            n9lVar.b = Arrays.copyOf(n9lVar.b, length);
                        } else {
                            n9lVar.b = new Object[Math.max(i, 10)];
                        }
                    }
                }
            }
            int size5 = list.size();
            if ((iterable instanceof List) && (iterable instanceof RandomAccess)) {
                List list2 = (List) iterable;
                int size6 = list2.size();
                for (int i2 = 0; i2 < size6; i2++) {
                    Object obj2 = list2.get(i2);
                    if (obj2 != null) {
                        list.add(obj2);
                    } else {
                        a(list, size5);
                        throw null;
                    }
                }
                return;
            }
            for (Object obj3 : iterable) {
                if (obj3 != null) {
                    list.add(obj3);
                } else {
                    a(list, size5);
                    throw null;
                }
            }
            return;
        }
        list.addAll((Collection) iterable);
    }

    public final void c() {
        if (!this.b.e()) {
            d8l g = this.a.g();
            m9l.c.a(g.getClass()).zzd(g, this.b);
            this.b = g;
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return d();
    }

    public final b8l d() {
        b8l b8lVar = (b8l) this.a.r(5);
        boolean e = this.b.e();
        d8l d8lVar = this.b;
        if (e) {
            d8lVar.h();
            d8lVar = this.b;
        }
        b8lVar.b = d8lVar;
        return b8lVar;
    }

    public final d8l e() {
        boolean e = this.b.e();
        d8l d8lVar = this.b;
        if (e) {
            d8lVar.h();
            d8lVar = this.b;
        }
        d8lVar.getClass();
        if (d8l.p(d8lVar, true)) {
            return d8lVar;
        }
        throw new t9l();
    }

    public final void f(d8l d8lVar) {
        d8l d8lVar2 = this.a;
        if (!d8lVar2.equals(d8lVar)) {
            if (!this.b.e()) {
                d8l g = d8lVar2.g();
                m9l.c.a(g.getClass()).zzd(g, this.b);
                this.b = g;
            }
            d8l d8lVar3 = this.b;
            m9l.c.a(d8lVar3.getClass()).zzd(d8lVar3, d8lVar);
        }
    }

    public final void g(byte[] bArr, int i, v7l v7lVar) {
        if (!this.b.e()) {
            d8l g = this.a.g();
            m9l.c.a(g.getClass()).zzd(g, this.b);
            this.b = g;
        }
        try {
            m9l.c.a(this.b.getClass()).e(this.b, bArr, 0, i, new be8(v7lVar));
        } catch (p8l e) {
            throw e;
        } catch (IOException e2) {
            omf.m("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            t4n.a("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
