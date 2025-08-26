package enums;

public enum Days {
    MONDAY("MONDAY javany okyim"),
    TUESDAY("TUESDAY javany okuim"),
    WEDNESDAY("WEDNESDAY javany okyim"),
    THURSDAY("THURSDAY jvany okyim"),
    FRIDAY("FRIDAY javany okyim"),
    SATURDAY("SATURDAY javany okyim"),
    SUNDAY(" SUNDAY es alam");
    private  final String sabak;

    Days(String sabak) {
        this.sabak = sabak;
    }

    public String getSabak() {
        return sabak;
    }
}

