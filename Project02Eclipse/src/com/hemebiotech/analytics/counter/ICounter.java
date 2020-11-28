package com.hemebiotech.analytics.counter;

import java.util.List;
import java.util.Map;

public interface ICounter {
    Map<String, Long> count(List<String> symptoms);
}
