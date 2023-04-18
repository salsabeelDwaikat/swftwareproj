Feature: Statistical Analysis

Scenario: Generate statistics about Cleaning Services for Carpets and Covers' performance

Given Cleaning Services for Carpets and Covers collects data on its services, including type of service, number of items cleaned, payment data, and other relevant information
When the collected data is processed
Then the following statistics are generated:

  | Statistics             |
  |-----------------------|
  | Total items cleaned    |
  | Total revenue          |
  | Total expenses         |
  | Profit margin          |
  | Average payment value  |
  | Average service duration|
  | Customer satisfaction rate|
  | Customer retention rate |

And the generated statistics are analyzed to identify trends, patterns, and areas for improvement

And the analyzed data is reported in a clear and concise manner, such as through dashboards, reports, or other visualizations.
