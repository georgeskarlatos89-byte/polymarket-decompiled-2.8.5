package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class x55 {
    public static final Set a = Collections.unmodifiableSet(EnumSet.of(xz2.PASSIVE_FOCUSED, xz2.PASSIVE_NOT_FOCUSED, xz2.LOCKED_FOCUSED, xz2.LOCKED_NOT_FOCUSED));
    public static final Set b = Collections.unmodifiableSet(EnumSet.of(zz2.CONVERGED, zz2.UNKNOWN));
    public static final Set c;
    public static final Set d;

    static {
        vz2 vz2Var = vz2.CONVERGED;
        vz2 vz2Var2 = vz2.FLASH_REQUIRED;
        vz2 vz2Var3 = vz2.UNKNOWN;
        Set unmodifiableSet = Collections.unmodifiableSet(EnumSet.of(vz2Var, vz2Var2, vz2Var3));
        c = unmodifiableSet;
        EnumSet copyOf = EnumSet.copyOf((Collection) unmodifiableSet);
        copyOf.remove(vz2Var2);
        copyOf.remove(vz2Var3);
        d = Collections.unmodifiableSet(copyOf);
    }
}
