==================================
unfiltered-scalatest-example
==================================

An example project demonstrating the usage of the Unfiltered scalatest support.
This project was seeded using g8T_


Changes
=====

1. The example test was modified to make it a bit more interesting
2. The ``App`` was changed to send a Bad Request (400) for invalid parameters
   which was surprisingly easy to achieve. Line ''32'' was prefixed with::

   BadRequest ~>


Attribution
=====

1. AXML_ for this readme's template
2. g8T_ for the excellent template for quick start


.. _g8T: https://github.com/softprops/unfiltered.g8


